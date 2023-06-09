package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AdminService adminService;

    // login을 위한 select by id and pw
    @PostMapping
    public void login(@RequestParam String id, @RequestParam String pw) {
        log.debug("LoginController.login() called: {} {}", id, pw);
        adminService.loginCheck(id, pw);
    }
}
