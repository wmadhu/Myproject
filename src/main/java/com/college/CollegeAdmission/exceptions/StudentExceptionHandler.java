package com.college.CollegeAdmission.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class StudentExceptionHandler {

    //NullPointer exception

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(StudentServiceException.class)
    public Map<String,String> StudentException(StudentServiceException ex)
    {

        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("Error",ex.getMessage());

        return errorMap;

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoResourceFoundException.class)
    public Map<String,String> GeneralException(NoResourceFoundException ex)
    {

        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("Error","Incorrect URL");

        return errorMap;

    }
}
