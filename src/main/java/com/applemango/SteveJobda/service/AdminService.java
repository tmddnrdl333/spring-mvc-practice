package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.domain.Admin;

import java.util.List;

public interface AdminService {
    public List<Admin> getAllAdmins();

    public Admin loginCheck(String id, String pw);
}
