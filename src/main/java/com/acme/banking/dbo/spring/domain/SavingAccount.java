package com.acme.banking.dbo.spring.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class SavingAccount extends Account {
    public SavingAccount() {
    }

    public SavingAccount(long id, double amount) {
        super(id, amount);
    }
}
