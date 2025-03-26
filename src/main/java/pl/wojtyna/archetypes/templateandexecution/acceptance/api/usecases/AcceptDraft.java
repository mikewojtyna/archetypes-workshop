package pl.wojtyna.archetypes.templateandexecution.acceptance.api.usecases;

import pl.wojtyna.archetypes.common.DomainEventPublisher;
import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DocumentPrepared;
import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DraftRepository;
import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.ValidationResult;
import pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction.Draft;

public class AcceptDraft {

    private DraftRepository draftRepository;
    private DomainEventPublisher eventPublisher;

    public void execute(String draftId) {
        draftRepository.find(draftId).ifPresent(draft -> {
            ValidationResult validationResult = validateAndAccept(draft);
            if (validationResult.isValid()) {
                eventPublisher.publish(new DocumentPrepared());
            }
        });
    }

    private ValidationResult validateAndAccept(Draft draft) {
        return null;
    }
}
