package com.example.controller.mapper;

import org.springframework.stereotype.Component;

@Component
class ErrorObject {
    private String errorCode;
    private String errorMessage;

    ErrorObject(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
