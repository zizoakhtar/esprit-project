package com.bezkoder.springjwt.security.services;

/**
 * Validator interface
 * @param <E>: validated type
 */
public interface Validator<E> {
    /**
     * Validate method
     * @param entity: E, entity to be validated
     */
    void validate(E entity);
}
