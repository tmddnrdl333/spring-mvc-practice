package com.applemango.SteveJobda.controller.rqrs;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Getter
public class UserSignupRq {

    @Pattern(regexp = "^[a-zA-Z0-9]{4,12}$")
    private String id;
    @Pattern(regexp = "^(?=.*[0-9a-zA-Z])[a-zA-Z0-9!@#$%^&*()._-]{6,15}$")
    private String password;
    @Pattern(regexp = "^(?=.*[0-9a-zA-Z])[a-zA-Z0-9!@#$%^&*()._-]{6,15}$")
    private String passwordCheck;
    @NotBlank
    private String name;
    @NotBlank
    private String team;
    @Pattern(regexp = "^[0-9-]{11,13}$")
    private String phone;
}
