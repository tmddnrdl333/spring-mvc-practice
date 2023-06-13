package com.applemango.SteveJobda.controller.request;

import lombok.Getter;

public class AdminRequest {

    @Getter
    public static class SignupRequest {
        private String id;
        private String pw;
        private String pwCheck;
        private String name;
        private String team;
        private String phone;
    }

    @Getter
    public static class LoginRequest {
        private String id;
        private String pw;
    }
}
