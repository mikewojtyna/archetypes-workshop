package pl.wojtyna.archetypes.common;

public interface DomainEventPublisher {

    void publish(DomainEvents events);

    void publish(DomainEvent event);
}
