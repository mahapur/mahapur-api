package com.example.controller;

import org.springframework.stereotype.Component;

@Component
public class SpendInfo {
    private String userName;
    private Integer amount;

    public SpendInfo() {
    }

    public SpendInfo(String userName, int amount) {
        this.userName = userName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SpendInfo{" +
                "userName='" + userName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
