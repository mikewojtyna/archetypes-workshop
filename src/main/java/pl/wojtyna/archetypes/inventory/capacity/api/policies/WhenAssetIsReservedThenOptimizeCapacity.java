package pl.wojtyna.archetypes.inventory.capacity.api.policies;

import pl.wojtyna.archetypes.inventory.catalog.api.usecases.HoldOffer;
import pl.wojtyna.archetypes.inventory.catalog.api.usecases.ReplenishOffer;
import pl.wojtyna.archetypes.inventory.catalog.domain.OfferId;
import pl.wojtyna.archetypes.inventory.catalog.domain.Quantity;
import pl.wojtyna.archetypes.inventory.reservations.api.events.ReservationEvent;

public class WhenAssetIsReservedThenOptimizeCapacity {

    private ReplenishOffer replenishOffer;
    private HoldOffer holdOffer;

    public void when(ReservationEvent.AssetReserved assetReserved) {
        optimizeCapacity(assetReserved);
    }

    private void optimizeCapacity(ReservationEvent.AssetReserved assetReserved) {
        if (demandIsHigherThanCapacity(assetReserved)) {
            replenishOffer.execute(findOfferId(assetReserved), new Quantity(10));
        }
        else {
            holdOffer.execute(findOfferId(assetReserved), new Quantity(5));
        }
    }

    private OfferId findOfferId(ReservationEvent.AssetReserved assetReserved) {
        return null;
    }

    private boolean demandIsHigherThanCapacity(ReservationEvent.AssetReserved assetReserved) {
        return false;
    }
}
