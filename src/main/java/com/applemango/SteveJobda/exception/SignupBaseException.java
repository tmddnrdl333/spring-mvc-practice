package com.applemango.SteveJobda.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SignupBaseException extends ResponseStatusException {
    public SignupBaseException(String reason) {
        super(HttpStatus.BAD_REQUEST, reason);
    }
}
