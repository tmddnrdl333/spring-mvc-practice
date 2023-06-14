package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.dao.AdminDao;
import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.exception.DuplicateIdException;
import com.applemango.SteveJobda.exception.InvalidValueException;
import com.applemango.SteveJobda.exception.PwNotMatchException;
import com.applemango.SteveJobda.util.Encrypter;
import com.applemango.SteveJobda.util.regexCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;

@RequiredArgsConstructor
@Service
public class AdminService {

    private static final String LOGIN = "login";

    private final AdminDao adminDao;

    /**
     *
     * @param request ㅇ
     * @return ㅇㅇ
     * @throws NoSuchAlgorithmException
     */
    public boolean signup(AdminRequest.SignupRequest request) throws NoSuchAlgorithmException {

        // ID not valid
        if (!regexCheck.checkId(request.getId())) {
            throw new InvalidValueException("ID");
        }
        // PW & PWCheck not match
        else if (!request.getPw().equals(request.getPwCheck())) {
            throw new PwNotMatchException();
        }
        // PW not valid
        else if (!regexCheck.checkPw(request.getPw())) {
            throw new InvalidValueException("PW");
        }
        // ID duplicated (탈퇴한 계정이더라도 ID 중복은 허용하지 않음)
        if (adminDao.isExistById(request.getId())) {
            throw new DuplicateIdException();
        }
        // 기타 null 등은 sqlException 날 것임.

        String pwEncrypted = Encrypter.encrypt(request.getPw());
        return adminDao.create(new Admin()
                .withId(request.getId())
                .withPw(pwEncrypted)
                .withName(request.getName())
                .withTeam(request.getTeam())
                .withPhone(request.getPhone())
        );

//        /* 자바빈즈 패턴 ~~ */
//        Admin admin = new Admin();
//        admin.setId(request.getId());
//        String pwEncrypted = encrypter.encrypt(request.getPw());
//        admin.setPw(pwEncrypted);
//        admin.setName(request.getName());
//        admin.setTeam(request.getTeam());
//        admin.setPhone(request.getPhone());
//        admin.setCreateDatetime(new Date());
//        admin.setDeleteYn(false);
//        adminDao.create(admin);

    }


    public boolean login(AdminRequest.LoginRequest request, HttpSession httpSession) throws NoSuchAlgorithmException {
        /* 처음에 findByIdAndPw로 했는데, Admin 객체를 주고받을 필요가 없을 것 같아서 isExist로 대체함. */
        if (adminDao.isExistByIdAndPw(request.getId(), Encrypter.encrypt(request.getPw()))) {
            httpSession.setAttribute(LOGIN, request.getId());
            httpSession.setMaxInactiveInterval(5 * 60); /* 5분 */
            return true;
        } else {
            return false;
        }
    }

    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }

    public AdminResponse.DetailResponse findAdminById(String id) {
        Admin admin = adminDao.findById(id);
        return AdminResponse.DetailResponse.builder()
                .id(admin.getId())
                .name(admin.getName())
                .team(admin.getTeam())
                .phone(admin.getPhone())
                .build();
    }

}
