package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Api(tags = {"AdminController (관리자 관련 기능)"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @ApiOperation(value = "내 정보 조회")
    @GetMapping("/self")
    public ResponseEntity myInfo(HttpSession httpSession) {
        String id = (String) httpSession.getAttribute("login");
        AdminResponse.DetailResponse response = adminService.findAdminById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
