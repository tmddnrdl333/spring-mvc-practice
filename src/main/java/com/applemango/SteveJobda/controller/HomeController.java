package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.service.AdminService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;

@Api(tags = {"HomeController (로그인/로그아웃, 회원가입)"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final AdminService adminService;

    @ApiResponses({
            @ApiResponse(code = 201, message = "회원가입 성공"),
            @ApiResponse(code = 400, message = "잘못된 요청")
    })
    @ApiOperation(value = "회원가입")
    @PostMapping("signup")
    public ResponseEntity signup(@ApiParam(value = "회원가입에 필요한 정보") @RequestBody AdminRequest.SignupRequest request) throws NoSuchAlgorithmException {
        if (adminService.signup(request)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("회원가입에 성공하였습니다.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("회원가입에 실패하였습니다.");
        }
    }

    @ApiOperation(value = "로그인")
    @PostMapping("login")
    public ResponseEntity login(@ApiParam(value = "로그인 ID & PW") @RequestBody AdminRequest.LoginRequest request, HttpSession httpSession) throws NoSuchAlgorithmException {
        if (adminService.login(request, httpSession)) {
            return ResponseEntity.status(HttpStatus.OK).body("로그인에 성공하였습니다.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("로그인에 실패하였습니다.");
        }
    }

    @ApiOperation(value = "로그아웃")
    @GetMapping("logout")
    public ResponseEntity logout(HttpSession httpSession) {
        adminService.logout(httpSession);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
