package com.template;

import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Arrays;
import java.util.List;

// *********
// * State *
// *********
public class VideoState implements ContractState {
    private final String identifier;
    private final Party creator;
    private final Party owner;
    private final List<AbstractParty> participants;

    public VideoState(String identifier, Party creator, Party owner, List<AbstractParty> participants) {
        this.identifier = identifier;
        this.creator = creator;
        this.owner = owner;
        this.participants = participants;
    }

    public String getIdentifier() { return identifier; }
    public Party getCreator() { return creator; }
    public Party getOwner() { return owner; }

    @Override
    public List<AbstractParty> getParticipants() {
        return participants;
    }
}