package pl.wojtyna.archetypes.inventory.reservations.api.events;

import pl.wojtyna.archetypes.common.DomainEvent;

public sealed interface ReservationEvent extends DomainEvent {

    record AssetReserved() implements ReservationEvent {}
}
