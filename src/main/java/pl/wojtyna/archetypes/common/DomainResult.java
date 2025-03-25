package pl.wojtyna.archetypes.common;

public record DomainResult<R>(R result, DomainEvents events) {
}
