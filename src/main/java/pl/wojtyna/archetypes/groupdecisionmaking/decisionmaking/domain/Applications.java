package pl.wojtyna.archetypes.groupdecisionmaking.decisionmaking.domain;

public class Applications {

    private final Signatories signatories;

    public Applications(Signatories signatories) {
        this.signatories = signatories;
    }

    public Idea openAccount() {
        return new Idea(signatories.requiredFor(IdeaType.OPEN_ACCOUNT));
    }
}
