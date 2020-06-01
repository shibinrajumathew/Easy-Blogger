package com.initialHibernate.initialHibernate.util;

import com.initialHibernate.initialHibernate.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CustomResponse {
    public ResponseEntity<?> setSuccessData (ArrayList<?> body) {
        Map<String,Object> responseData = new LinkedHashMap<>();
        responseData.put("success", "true");
        responseData.put("data",body);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
    public ResponseEntity<?> setFailedData (String message, HttpStatus status) {
        Map<String,Object> responseData = new LinkedHashMap<>();
        Map<String,Object> error = new LinkedHashMap<>();
        error.put("errorCode", status);
        error.put("message",message);
        responseData.put("success", "false");
        responseData.put("error",error);
        return new ResponseEntity<>(responseData, status);
    }
}
