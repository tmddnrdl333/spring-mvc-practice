package com.applemango.SteveJobda.exception;

public class DuplicateIdException extends SignupBaseException {

    public DuplicateIdException() {
        super("중복된 아이디가 존재합니다.");
    }
}
