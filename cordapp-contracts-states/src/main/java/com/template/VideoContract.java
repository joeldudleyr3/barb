package com.template;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;

// ************
// * Contract *
// ************
public class VideoContract implements Contract {
    // This is used to identify our contract when building a transaction.
    public static final String ID = "com.template.VideoContract";

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    @Override
    public void verify(LedgerTransaction tx) {
        // Issuance of video rules.
            // Creator must sign.

        // Transfer of video rules.
            // Owner must sign.
    }

    // Used to indicate the transaction's intent.
    public interface Commands extends CommandData {
        class Issue implements Commands {}
        class Transfer implements Commands {}
    }
}