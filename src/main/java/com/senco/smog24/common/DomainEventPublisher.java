package com.senco.smog24.common;

public interface DomainEventPublisher {

    void publish(DomainEvent event);
}
