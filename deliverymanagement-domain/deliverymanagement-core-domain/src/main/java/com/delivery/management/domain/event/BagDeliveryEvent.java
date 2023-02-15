package com.delivery.management.domain.event;

import com.delivery.management.domain.base.event.DomainEvent;
import com.delivery.management.domain.entity.Bag;

import java.time.OffsetDateTime;

public record BagDeliveryEvent(Bag bag, OffsetDateTime createdAt) implements DomainEvent<Bag> { }