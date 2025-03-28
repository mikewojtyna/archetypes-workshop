package pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.domain;

public record Signature(String username) {

    public boolean isSignedBy(Decider decider) {
        return username.equals(decider.username());
    }
}
