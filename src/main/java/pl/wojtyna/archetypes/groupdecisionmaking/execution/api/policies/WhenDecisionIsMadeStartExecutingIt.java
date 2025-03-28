package pl.wojtyna.archetypes.groupdecisionmaking.execution.api.policies;

import pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.api.events.DecisionMade;

public class WhenDecisionIsMadeStartExecutingIt {

    public void when(DecisionMade decisionMade) {
        executeBasedOnDecision(decisionMade);
    }

    private void executeBasedOnDecision(DecisionMade decisionMade) {
        
    }
}
