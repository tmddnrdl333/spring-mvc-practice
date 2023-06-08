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
        System.out.println("SERVICE");
        List<Admin> list = adminDao.getAllAdmins();
        System.out.println(list);
        return list;
    }
}
