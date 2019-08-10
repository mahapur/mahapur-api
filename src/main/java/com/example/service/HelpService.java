package com.example.service;

import com.example.model.HelpInfo;
import com.example.repository.HelpInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class HelpService {
    private HelpInfoRepository repository;

    @Autowired
    public HelpService(HelpInfoRepository repository) {
        this.repository = repository;
    }

    public List<HelpInfo> get(String city) {
        return repository.findAllByCity(city);
    }

    public List<HelpInfo> getAll() {
        List<HelpInfo> sangli = repository.findAllByCity("sangli");
        List<HelpInfo> kolhapur = repository.findAllByCity("kolhapur");
        sangli.addAll(kolhapur);
        return sangli;
    }
}
