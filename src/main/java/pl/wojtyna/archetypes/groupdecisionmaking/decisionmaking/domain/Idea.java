package pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.domain;

import pl.wojtyna.archetypes.common.DomainEvents;

import java.util.HashSet;
import java.util.Set;

public class Idea {

    private final Set<Decider> requiredSignatories;
    private final Set<Signature> signatures;
    private boolean cancelled = false;

    public Idea(Set<Decider> requiredSignatories) {
        this.requiredSignatories = new HashSet<>(requiredSignatories);
        this.signatures = new HashSet<>();
    }

    public DomainEvents withdraw(CancellationPolicy cancellationPolicy, Decider decider) {
        if (!cancelled && cancellationPolicy.canBeCancelledBy(decider)) {
            cancelled = true;
            return DomainEvents.of(new IdeaRejected());
        }
        return DomainEvents.empty();
    }

    public DomainEvents accept(Signature signature) {
        var events = DomainEvents.empty();
        if (requiredSignatories.removeIf(signature::isSignedBy)) {
            signatures.add(signature);
            events = events.following(new IdeaAccepted());
        }
        if (isSignedByAllSignatories()) {
            events = events.following(new DecisionMade());
        }
        return events;
    }

    public boolean isSignedByAllSignatories() {
        return requiredSignatories.isEmpty();
    }
}
