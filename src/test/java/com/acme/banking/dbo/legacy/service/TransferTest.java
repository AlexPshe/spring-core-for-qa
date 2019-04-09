package com.acme.banking.dbo.legacy.service;

import com.acme.banking.dbo.legacy.domain.Account;
import com.acme.banking.dbo.legacy.domain.AccountType;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class TransferTest {
    @Test(expected = IllegalStateException.class)
    public void shouldConsiderAccountTypeWhenSavingAccount() {
        Account savingAccount = new Account();
        savingAccount.type = AccountType.SAVING;
        savingAccount.amount = 100;
        savingAccount.creditLimit = 1_000;

        TransferService.withdraw(savingAccount, 500);
    }

    @Test
    public void shouldConsiderAccountTypeWhenCheckingAccount() {
        Account checkingAccount = new Account();
        checkingAccount.type = AccountType.CHECKING;
        checkingAccount.amount = 100;
        checkingAccount.creditLimit = 1_000;

        TransferService.withdraw(checkingAccount, 500);

        assertThat(checkingAccount.amount).isEqualTo(-400);
    }
}
