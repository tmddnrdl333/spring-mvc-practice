package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping(value = "/")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("signup")
    public ResponseEntity signup(@RequestBody AdminRequest.SignupRequest request) throws NoSuchAlgorithmException {
        adminService.signup(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("회원가입 성공 임시 바디");
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody AdminRequest.LoginRequest request, HttpSession httpSession) throws NoSuchAlgorithmException {
        if (adminService.login(request, httpSession)) {
            return ResponseEntity.status(HttpStatus.OK).body("로그인 성공 임시 바디");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("로그인 실패 임시 바디");
        }
    }

    @GetMapping("logout")
    public ResponseEntity logout(HttpSession httpSession) {
        // service
        adminService.logout(httpSession);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    /* TODO: 테스트용이니 삭제할 것. */
    @GetMapping("session")
    public ResponseEntity checkSession(HttpSession httpSession) {
        if (httpSession.getAttribute("login") == null) return ResponseEntity.status(404).body(null);
        return ResponseEntity.status(200).body(httpSession.getAttribute("login"));
    }
}
