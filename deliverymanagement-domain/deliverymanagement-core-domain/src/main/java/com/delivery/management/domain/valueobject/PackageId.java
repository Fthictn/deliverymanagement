package com.delivery.management.domain.valueobject;

import com.delivery.management.domain.base.valueobject.BaseId;

import java.util.UUID;

public class PackageId extends BaseId<UUID> {
    public PackageId(UUID value) {
        super(value);
    }
}
