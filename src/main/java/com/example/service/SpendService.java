package com.example.service;

import com.example.model.Spend;
import com.example.model.SpendInfo;
import com.example.repository.SpendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpendService {
    private SpendRepository repository;

    @Autowired
    public SpendService(SpendRepository repository) {
        this.repository = repository;
    }

    public SpendInfo addSpend(Spend spend) {
        repository.save(spend);
        final String userId = spend.getUserId();
        final Double totalSpend = repository.getTotalSpend(userId);
        return new SpendInfo(userId,totalSpend);
    }

    public SpendInfo get(String userId) {
        final Double totalSpend = repository.getTotalSpend(userId);
        return new SpendInfo(userId, totalSpend);
    }
}
