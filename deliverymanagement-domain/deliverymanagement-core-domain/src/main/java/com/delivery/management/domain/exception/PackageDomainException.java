package com.delivery.management.domain.exception;

import com.delivery.management.domain.base.exception.DomainException;

public class PackageDomainException extends DomainException {
    public PackageDomainException(String message) {
        super(message);
    }

    public PackageDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
