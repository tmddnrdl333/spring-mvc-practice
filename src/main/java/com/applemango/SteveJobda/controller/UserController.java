package com.applemango.SteveJobda.controller;

import com.applemango.SteveJobda.controller.rqrs.UserDetailRs;
import com.applemango.SteveJobda.controller.rqrs.UserLoginRq;
import com.applemango.SteveJobda.controller.rqrs.UserSignupRq;
import com.applemango.SteveJobda.service.UserService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;

@Api(tags = {"UserController (사용자 관련 기능)"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @ApiResponses({
            @ApiResponse(code = 201, message = "회원가입 성공"),
            @ApiResponse(code = 400, message = "잘못된 요청")
            /* TODO: 기타 예외는 처리 후 등록 */
    })
    @ApiOperation(value = "회원가입")
    @PostMapping("signup")
    public ResponseEntity<String> signup(
            @ApiParam(value = "회원가입에 필요한 정보") @RequestBody @Valid UserSignupRq request
    ) throws NoSuchAlgorithmException {
        if (userService.signup(request)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("회원가입 성공");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("회원가입 실패");
    }

    @ApiResponses({
            @ApiResponse(code = 200, message = "로그인 성공"),
            @ApiResponse(code = 400, message = "잘못된 요청")
            /* TODO: 기타 예외는 처리 후 등록 */
    })
    @ApiOperation(value = "로그인")
    @PostMapping("login")
    public ResponseEntity<String> login(
            @ApiParam(value = "로그인 아이디와 패스워드") @Valid @RequestBody UserLoginRq request,
            HttpSession httpSession
    ) throws NoSuchAlgorithmException {
        if (userService.login(request, httpSession)) {
            return ResponseEntity.status(HttpStatus.OK).body("로그인 성공");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("로그인 실패");
    }

    @ApiResponses({
            @ApiResponse(code = 204, message = "로그아웃 성공")
    })
    @ApiOperation(value = "로그아웃")
    @GetMapping("logout")
    public ResponseEntity<Void> logout(HttpSession httpSession) {
        userService.logout(httpSession);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @ApiResponses({
            @ApiResponse(code = 200, message = "조회된 정보", response = UserDetailRs.class),
            @ApiResponse(code = 401, message = "권한 없음") /* TODO */
    })
    @ApiOperation(value = "내 정보 조회")
    @GetMapping("user/my-info")
    public ResponseEntity<UserDetailRs> myInfo(HttpSession httpSession) {
        String id = (String) httpSession.getAttribute("login");
        UserDetailRs response = userService.findUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


}