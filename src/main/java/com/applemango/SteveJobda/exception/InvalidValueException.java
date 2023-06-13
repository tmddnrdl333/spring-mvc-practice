package com.applemango.SteveJobda.exception;

public class InvalidValueException extends SignupBaseException {

    public InvalidValueException(String param) {
        super("적절하지 않은 " + param + "값이 입력되었습니다.");
    }
}
