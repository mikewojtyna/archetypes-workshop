package pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.domain;

public interface CancellationPolicy {

    boolean canBeCancelledBy(Decider signatory);
}
