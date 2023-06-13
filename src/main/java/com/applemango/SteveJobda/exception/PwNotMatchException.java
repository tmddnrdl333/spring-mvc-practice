package com.applemango.SteveJobda.exception;

public class PwNotMatchException extends SignupBaseException {

    public PwNotMatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}
