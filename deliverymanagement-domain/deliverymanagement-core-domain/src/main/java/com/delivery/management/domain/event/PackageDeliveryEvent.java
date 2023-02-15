package com.delivery.management.domain.event;

import com.delivery.management.domain.base.event.DomainEvent;
import com.delivery.management.domain.entity.Package;

import java.time.OffsetDateTime;

public record PackageDeliveryEvent(Package aPackage, OffsetDateTime createdAt) implements DomainEvent<Package> { }
