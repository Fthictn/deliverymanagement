package com.delivery.management.domain.base.event.publisher;


import com.delivery.management.domain.base.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
