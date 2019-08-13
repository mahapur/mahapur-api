package com.example.controller;

import com.example.model.HelpInfo;
import com.example.service.CacheService;
import com.example.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelpController {
    private HelpService service;
    private CacheService cacheService;

    @Autowired
    public HelpController(HelpService service, CacheService cacheService) {
        this.service = service;
        this.cacheService = cacheService;
    }

    @GetMapping(value = "/help/{city}")
    @ResponseBody
    public List<HelpInfo> getHelp(@PathVariable String city) {
        return cacheService.get("help/" + city, () -> service.get(city));
    }

    @GetMapping(value = "/help")
    @ResponseBody
    public List<HelpInfo> getAllHelp() {
        return cacheService.get("help", () -> service.getAll());
    }

    @PostMapping(value = "/help")
    @ResponseBody
    public HelpInfo createHelp(@RequestBody HelpInfo helpInfo) {
        HelpInfo created = service.create(helpInfo);
        cacheService.add("help/" + helpInfo.getCity(), helpInfo);
        cacheService.add("help", helpInfo);
        return created;
    }
}