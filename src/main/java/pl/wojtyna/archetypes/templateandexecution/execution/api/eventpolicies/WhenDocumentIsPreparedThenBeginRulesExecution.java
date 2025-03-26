package pl.wojtyna.archetypes.templateandexecution.execution.api.eventpolicies;

import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DocumentPrepared;

public class WhenDocumentIsPreparedThenBeginRulesExecution {
    public void when(DocumentPrepared documentPrepared) {
        initiateRulesExecution();
    }

    private void initiateRulesExecution() {

    }
}
