package com.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
//When a resource does not exist in a database then it will throw the following exception
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUId = 1L;

    public ResourceNotFoundException(String message){
//        pass this message to the super-class
        super(message);
    }
}
