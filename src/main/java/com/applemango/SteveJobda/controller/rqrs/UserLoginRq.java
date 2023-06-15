package com.applemango.SteveJobda.controller.rqrs;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.Pattern;

@Data
@Getter
public class UserLoginRq {
    @Pattern(regexp = "^[a-zA-Z0-9]{4,12}$")
    private String id;
    @Pattern(regexp = "^(?=.*[0-9a-zA-Z])[a-zA-Z0-9!@#$%^&*()._-]{6,15}$")
    private String password;
}
