package pl.wojtyna.archetypes.inventory.catalog.api.usecases;

import pl.wojtyna.archetypes.inventory.catalog.domain.OfferId;
import pl.wojtyna.archetypes.inventory.catalog.domain.Quantity;
import pl.wojtyna.archetypes.inventory.reservations.api.usecases.RemoveAsset;
import pl.wojtyna.archetypes.inventory.reservations.domain.Asset;

public class HoldOffer {

    private RemoveAsset removeAsset;

    public void execute(OfferId offerId, Quantity quantity) {
        removeAsset.execute(toAsset(offerId));
    }

    private Asset toAsset(OfferId offer) {
        return null;
    }
}