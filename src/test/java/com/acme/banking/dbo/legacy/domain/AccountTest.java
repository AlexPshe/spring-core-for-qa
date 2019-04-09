package com.acme.banking.dbo.legacy.domain;

import com.acme.banking.dbo.legacy.domain.Account;
import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class AccountTest {
    @Test @Ignore
    public void externalCodeShouldConcernStateConsistency() {
        Account accountStructure = new Account();
        accountStructure.creditLimit = 1_000;
        accountStructure.amount = 0;

        //Look ma, no checks!
        accountStructure.amount -= 2_000;

        assertThat(accountStructure.amount)
            .describedAs("Inconsistent state when lack of behavior encapsulation within Account")
            .isGreaterThan(-1_000);
    }
}
