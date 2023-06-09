package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    AdminDao adminDao;

    @Override
    public void login(String id, String pw) {
        adminDao.getAdminByIdPw(id, pw);
    }
}
