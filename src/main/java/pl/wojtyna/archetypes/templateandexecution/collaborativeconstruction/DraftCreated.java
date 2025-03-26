package pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction;

import pl.wojtyna.archetypes.common.DomainEvent;

public record DraftCreated(Draft draft) implements DomainEvent {
}
