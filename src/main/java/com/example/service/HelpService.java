package com.example.service;

import com.example.model.HelpInfo;
import com.example.repository.HelpInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        List<HelpInfo> list1 = repository.findAllByCity("sangli");
        List<HelpInfo> list2 = repository.findAllByCity("kolhapur");
        list1.addAll(list2);
        return list1.stream()
                .sorted((o1, o2) -> (int) (o2.getId() - o1.getId()))
                .collect(Collectors.toList());
    }

    public HelpInfo create(HelpInfo helpInfo) {
        return repository.save(helpInfo);
    }
}
