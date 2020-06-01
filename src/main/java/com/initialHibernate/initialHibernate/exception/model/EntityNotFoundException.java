package com.initialHibernate.initialHibernate.exception.model;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
