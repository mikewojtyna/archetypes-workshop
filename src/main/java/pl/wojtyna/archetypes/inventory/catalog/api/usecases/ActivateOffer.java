package pl.wojtyna.archetypes.inventory.catalog.api.usecases;

import pl.wojtyna.archetypes.inventory.catalog.domain.OfferId;
import pl.wojtyna.archetypes.inventory.catalog.domain.Quantity;
import pl.wojtyna.archetypes.inventory.reservations.api.usecases.AddAsset;
import pl.wojtyna.archetypes.inventory.reservations.domain.Asset;

public class ActivateOffer {

    private AddAsset addAsset;

    public void execute(OfferId offerId, Quantity quantity) {
        addAsset.execute(toAsset(offerId));
    }

    private Asset toAsset(OfferId offerId) {
        return null;
    }
}
