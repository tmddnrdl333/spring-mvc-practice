package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.dao.AdminDao;
import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.exception.DuplicateIdException;
import com.applemango.SteveJobda.exception.InvalidValueException;
import com.applemango.SteveJobda.exception.PwNotMatchException;
import com.applemango.SteveJobda.util.encrypter;
import com.applemango.SteveJobda.util.regexCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Service
public class AdminService {

    private static final String LOGIN = "login";
    @Autowired
    private AdminDao adminDao;

    public void signup(AdminRequest.SignupRequest request) throws NoSuchAlgorithmException {

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
        // ID duplicated
        if (findAdminById(request.getId()) != null) {
            throw new DuplicateIdException();
        }

        /* 자바빈즈 패턴 ~~ */
        Admin admin = new Admin();
        admin.setId(request.getId());
        String pwEncrypted = encrypter.encrypt(request.getPw());
        admin.setPw(pwEncrypted);
        admin.setName(request.getName());
        admin.setTeam(request.getTeam());
        admin.setPhone(request.getPhone());
        admin.setCreateDatetime(new Date());
        admin.setDeleteYn(false);
        adminDao.create(admin);

    }

    public Admin findAdminById(String id) {
        return adminDao.findById(id);
    }

    public boolean login(AdminRequest.LoginRequest request, HttpSession httpSession) throws NoSuchAlgorithmException {
        /* 처음에 findByIdAndPw로 했는데, Admin 객체를 주고받을 필요가 없을 것 같아서 isExist로 대체함. */
        if (adminDao.isExistByIdAndPw(request.getId(), encrypter.encrypt(request.getPw()))) {
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

    /* TODO: 테스트용이니 삭제할 것 */
    public AdminResponse.DetailResponse test(Integer admin_sn) {
        return adminDao.test(admin_sn);
    }
}
