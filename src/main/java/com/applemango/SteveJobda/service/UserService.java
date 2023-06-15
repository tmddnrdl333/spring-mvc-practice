package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.controller.response.UserResponse;
import com.applemango.SteveJobda.controller.rqrs.UserLoginRq;
import com.applemango.SteveJobda.controller.rqrs.UserSignupRq;
import com.applemango.SteveJobda.dao.UserDao;
import com.applemango.SteveJobda.db.generate.model.User;
import com.applemango.SteveJobda.exception.DuplicateIdException;
import com.applemango.SteveJobda.exception.InvalidValueException;
import com.applemango.SteveJobda.exception.PasswordNotMatchException;
import com.applemango.SteveJobda.util.EncryptionUtil;
import com.applemango.SteveJobda.util.RegexUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;


@RequiredArgsConstructor
@Service
public class UserService {

    private static final String LOGIN = "login";

    private final UserDao userDao;

    /**
     * 회원가입
     *
     * @param request
     * @return 회원가입 성공여부
     * @throws NoSuchAlgorithmException
     * @설명 회원가입
     */
    public boolean signup(UserSignupRq request) throws NoSuchAlgorithmException {

        if (!RegexUtil.checkId(request.getId())) {
            throw new InvalidValueException("ID");
        } else if (!request.getPassword().equals(request.getPasswordCheck())) {
            throw new PasswordNotMatchException();
        } else if (!RegexUtil.checkPassword(request.getPassword())) {
            throw new InvalidValueException("PASSWORD");
        }
        if (userDao.isExistById(request.getId())) {
            throw new DuplicateIdException();
        }

        String passwordEncrypted = EncryptionUtil.encrypt(request.getPassword());

        return userDao.create(new User()
                .withId(request.getId())
                .withPassword(passwordEncrypted)
                .withName(request.getName())
                .withTeam(request.getTeam())
                .withPhone(request.getPhone())
        );

    }

    /**
     * 로그인
     *
     * @param request
     * @param httpSession
     * @return 로그인 성공여부
     * @throws NoSuchAlgorithmException
     * @설명 로그인
     */
    public boolean login(UserLoginRq request, HttpSession httpSession) throws NoSuchAlgorithmException {
        if (userDao.isExistByIdAndPassword(request.getId(), EncryptionUtil.encrypt(request.getPassword()))) {
            httpSession.setAttribute(LOGIN, request.getId());
            httpSession.setMaxInactiveInterval(30 * 60); /* 30분 */
            return true;
        }
        return false;
    }

    /**
     * 로그아웃
     *
     * @param httpSession
     * @설명 로그아웃
     */
    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }

    public UserResponse.DetailResponse findUserById(String id) {
        User user = userDao.findById(id);
        return UserResponse.DetailResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .team(user.getTeam())
                .phone(user.getPhone())
                .build();
    }

}
