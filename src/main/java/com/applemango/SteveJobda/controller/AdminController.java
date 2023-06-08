package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/*")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("all")
    public String getAllAdmins(Model model) {
        System.out.println("CONTROLLER");
        List<Admin> list = adminService.getAllAdmins();
        System.out.println(list);
        model.addAttribute("data", list);
        return "index";
    }
}
