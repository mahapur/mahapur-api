package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class SpendInfo {
    private Double totalSpend;
    private String userName;

    public SpendInfo(String userName, Double totalSpend) {
        this.totalSpend = totalSpend;
        this.userName = userName;
    }

    public SpendInfo() {
    }

    public Double getTotalSpend() {
        return totalSpend;
    }

    public void setTotalSpend(Double totalSpend) {
        this.totalSpend = totalSpend;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
