package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.dao.AdminDao;
import com.applemango.SteveJobda.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public Admin getAdminByAdminSn(Integer adminSn) {
        System.out.println("SERVICE");
        Admin admin = adminDao.getAdminByAdminSn(adminSn);
        System.out.println(admin);
        return admin;
    }
}
