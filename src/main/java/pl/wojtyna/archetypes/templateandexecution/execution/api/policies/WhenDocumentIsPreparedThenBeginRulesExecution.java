package pl.wojtyna.archetypes.templateandexecution.execution.api.policies;

import pl.wojtyna.archetypes.templateandexecution.acceptance.domain.DocumentPrepared;

public class WhenDocumentIsPreparedThenBeginRulesExecution {
    public void when(DocumentPrepared documentPrepared) {
        initiateRulesExecution();
    }

    private void initiateRulesExecution() {

    }
}
