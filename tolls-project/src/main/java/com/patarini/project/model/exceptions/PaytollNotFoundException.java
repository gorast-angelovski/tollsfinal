package com.patarini.project.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PaytollNotFoundException extends RuntimeException {
    public PaytollNotFoundException(Long id) {
        super(String.format("Paytoll with id %d was not found!", id));
    }
}
