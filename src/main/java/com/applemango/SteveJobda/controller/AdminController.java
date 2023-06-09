package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AdminService adminService;

    // (testd용) select all admin
    @GetMapping("all")
    public String getAllAdmins(Model model) {
        List<Admin> list = adminService.getAllAdmins();
        model.addAttribute("data", list);
        log.debug("HI: {}", list);
        return "index";
    }

}
