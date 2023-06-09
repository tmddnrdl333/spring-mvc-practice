package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.dao.AdminDao;
import com.applemango.SteveJobda.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public List<Admin> getAllAdmins() {
        List<Admin> list = adminDao.getAllAdmins();
        return list;
    }

    @Override
    public Admin loginCheck(String id, String pw) {
        return adminDao.getAdminByIdPw(id,pw);
    }
}
