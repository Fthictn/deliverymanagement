package com.delivery.management.domain.exception;

import com.delivery.management.domain.base.exception.DomainException;

public class BagDomainException extends DomainException {
    public BagDomainException(String message) {
        super(message);
    }

    public BagDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
