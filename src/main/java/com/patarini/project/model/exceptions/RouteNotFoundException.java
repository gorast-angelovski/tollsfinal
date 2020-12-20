package com.patarini.project.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RouteNotFoundException extends RuntimeException{
    public RouteNotFoundException(Long id){
        super(String.format("Balloon with id %d was not found!", id));
    }
}
