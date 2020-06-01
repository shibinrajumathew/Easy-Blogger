package com.initialHibernate.initialHibernate.exception.handler;

import com.initialHibernate.initialHibernate.exception.model.EntityNotFoundException;
import com.initialHibernate.initialHibernate.util.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @Autowired
    CustomResponse customResponse;
@ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleServiceException (EntityNotFoundException  enf) {
    return  customResponse.setFailedData(enf.getMessage(), HttpStatus.NOT_FOUND);
}
}