package com.applemango.SteveJobda.exception;

public class PasswordNotMatchException extends SignupBaseException {

    public PasswordNotMatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}
