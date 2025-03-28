package pl.wojtyna.archetypes.templateandexecution.acceptance.api.policies;

import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DraftRepository;
import pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction.DraftCreated;

public class WhenDraftIsCreatedThenStoreIt {

    private DraftRepository draftRepository;

    public void when(DraftCreated draftCreated) {
        draftRepository.save(draftCreated.draft());
    }
}
