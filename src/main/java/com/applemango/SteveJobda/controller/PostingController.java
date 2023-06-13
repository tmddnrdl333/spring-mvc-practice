package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member/posting")
public class PostingController {

    /* TODO: 테스트용이니 삭제할 것. */
    @Autowired
    AdminService adminService;

    /* TODO: 테스트용이니 삭제할 것. */
    @GetMapping("/{admin_sn}")
    public ResponseEntity testGetAdminBySn(@PathVariable Integer admin_sn) {
        AdminResponse.DetailResponse response = adminService.test(admin_sn);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
