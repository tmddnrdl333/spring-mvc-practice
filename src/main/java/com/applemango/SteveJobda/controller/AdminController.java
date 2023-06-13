package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("signup")
    public ResponseEntity signup(@RequestBody AdminRequest.SignupRequest request) throws Exception {
        adminService.signup(request);
        return ResponseEntity.status(HttpStatus.OK).body("임시 바디");
    }
}
