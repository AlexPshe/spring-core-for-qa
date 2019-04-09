package com.acme.banking.dbo.spring.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount() {
    }

    public CheckingAccount(long id, double amount, double overdraft) {
        super(id, amount);
        this.overdraft = overdraft;
    }
}
