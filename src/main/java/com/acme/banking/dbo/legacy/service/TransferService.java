package com.acme.banking.dbo.legacy.service;

import com.acme.banking.dbo.legacy.domain.Account;
import com.acme.banking.dbo.legacy.domain.AccountType;

public class TransferService {
    public static void withdraw(Account from, double amount) {
        if (from.type == AccountType.SAVING) {
            if (amount > from.amount) throw new IllegalStateException("Not enough funds to withdraw");
        } else if (from.type == AccountType.CHECKING) {
            if (amount > from.amount + from.creditLimit) throw new IllegalStateException("Not enough funds to withdraw");
        }

        from.amount -= amount;
    }
}
