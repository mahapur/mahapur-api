package com.example.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@Service
public class CacheService<T> {
    private Map<String, List<T>> map = new HashMap<>();

    public List<T> get(String key, Supplier<List<T>> supplier) {
        if (!map.containsKey(key)) {
            map.put(key, supplier.get());
        }
        return map.get(key);
    }

    public void add(String key, T helpInfo) {
        List<T> helpInfos = map.get(key);
        if (helpInfos == null) {
            helpInfos = new LinkedList<>();
        }
        helpInfos.add(helpInfo);
    }
}
