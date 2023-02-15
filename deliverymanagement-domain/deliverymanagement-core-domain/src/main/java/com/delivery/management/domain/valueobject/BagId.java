package com.delivery.management.domain.valueobject;

import com.delivery.management.domain.base.valueobject.BaseId;

import java.util.UUID;

public class BagId extends BaseId<UUID> {
    public BagId(UUID value) {
        super(value);
    }
}
