package com.example.model;

public class Spend {
    private String userName;
    private Double amount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userName='" + userName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
