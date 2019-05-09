package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "spend")
public class Spend {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "amount")
    private Double amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Spend{" +
                "userId='" + userId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
