package pl.wojtyna.archetypes.inventory.reservations.api.usecases;

import pl.wojtyna.archetypes.common.DomainEventPublisher;
import pl.wojtyna.archetypes.inventory.reservations.api.events.ReservationEvent;
import pl.wojtyna.archetypes.inventory.reservations.domain.AssetId;
import pl.wojtyna.archetypes.inventory.reservations.domain.Customer;

public class ReserveAsset {

    private DomainEventPublisher domainEventPublisher;

    public void execute(AssetId assetId, Customer customer) {
        domainEventPublisher.publish(new ReservationEvent.AssetReserved());
    }
}
