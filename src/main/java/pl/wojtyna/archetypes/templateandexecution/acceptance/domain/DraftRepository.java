package pl.wojtyna.archetypes.templateandexecution.acceptance.domain;

import pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction.Draft;
import pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction.DraftCreated;

import java.util.Optional;

public interface DraftRepository {

    void save(Draft draft);

    Optional<Draft> find(String draftId);
}
