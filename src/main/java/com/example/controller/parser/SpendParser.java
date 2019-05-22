package com.example.controller.parser;

import com.example.model.Spend;
import org.springframework.stereotype.Component;

@Component
public class SpendParser {
    private String userId;
    private Double amount;
    private final static String SEPARATOR = " ";


    public Spend parse(String userId, String text) {
        final Spend spend = new Spend();
        spend.setUserId(userId);
        final String amount = text.split(SEPARATOR)[0];
        spend.setAmount(Double.parseDouble(amount));
        return spend;
    }
}
