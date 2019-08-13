package com.example.service;

import com.example.model.HelpInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@Service
public class CacheService {
    private Map<String, List<HelpInfo>> map = new HashMap<>();

    public List<HelpInfo> get(String key, Supplier<List<HelpInfo>> supplier) {
        if (!map.containsKey(key)) {
            map.put(key, supplier.get());
        }
        return map.get(key);
    }

    public void add(String key, HelpInfo helpInfo) {
        List<HelpInfo> helpInfos = map.get(key);
        if (helpInfos == null) {
            helpInfos = new LinkedList<>();
        }
        helpInfos.add(helpInfo);
    }
}
