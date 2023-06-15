package com.applemango.SteveJobda.controller.rqrs;

import lombok.Getter;

@Getter
public class UserSignupRq {
    private String id;
    private String password;
    private String passwordCheck;
    private String name;
    private String team;
    private String phone;
}
