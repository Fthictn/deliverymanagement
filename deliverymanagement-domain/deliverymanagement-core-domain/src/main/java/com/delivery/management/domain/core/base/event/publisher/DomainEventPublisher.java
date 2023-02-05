package com.delivery.management.domain.core.base.event.publisher;


import com.delivery.management.domain.core.base.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
