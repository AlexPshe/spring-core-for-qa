package com.acme.banking.dbo.spring.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
@DiscriminatorColumn(name="ACCOUNT_TYPE")
public abstract class Account {
    @Id private long id;
    private double amount;

    public Account() {
    }

    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
