package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.controller.rqrs.UserDetailRs;
import com.applemango.SteveJobda.controller.rqrs.UserLoginRq;
import com.applemango.SteveJobda.controller.rqrs.UserSignupRq;
import com.applemango.SteveJobda.dao.UserDao;
import com.applemango.SteveJobda.db.generate.model.User;
import com.applemango.SteveJobda.exception.DuplicateIdException;
import com.applemango.SteveJobda.exception.PasswordNotMatchException;
import com.applemango.SteveJobda.util.EncryptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

        if (!request.getPassword().equals(request.getPasswordCheck())) {
            throw new PasswordNotMatchException();
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

    public UserDetailRs findUserById(String id) {
        User user = userDao.findById(id);
        if (user == null) throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "아이디가 변경되었습니다.");
        return UserDetailRs.builder()
                .id(user.getId())
                .name(user.getName())
                .team(user.getTeam())
                .phone(user.getPhone())
                .build();
    }

}
