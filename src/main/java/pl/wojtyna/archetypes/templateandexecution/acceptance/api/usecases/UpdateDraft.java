package pl.wojtyna.archetypes.templateandexecution.acceptance.api.usecases;

import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DraftRepository;
import pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction.Draft;

public class UpdateDraft {

    private DraftRepository draftRepository;

    public void execute(String draftId, Draft updatedDraft) {
        draftRepository.save(updatedDraft);
    }
}
