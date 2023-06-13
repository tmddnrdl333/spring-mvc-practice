package com.applemango.SteveJobda.controller.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseResponse extends ResponseEntity {

    public BaseResponse(Object body, HttpStatus status) {
        super(body, status);
    }
}
