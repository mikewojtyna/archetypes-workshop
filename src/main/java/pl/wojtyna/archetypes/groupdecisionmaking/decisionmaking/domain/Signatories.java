package pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.domain;

import java.util.Set;

public interface Signatories {

    Set<Decider> requiredFor(IdeaType ideaType);
}
