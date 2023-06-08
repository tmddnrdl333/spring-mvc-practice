package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("1")
    public String getAdminByAdminSn(Model model) {
        System.out.println("CONTROLLER");
        Admin admin = adminService.getAdminByAdminSn(1);
        System.out.println(admin);
        model.addAttribute("data", admin);
        return "index";
    }
}
