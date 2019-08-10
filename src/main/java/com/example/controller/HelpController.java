package com.example.controller;

import com.example.model.HelpInfo;
import com.example.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelpController {
    private HelpService service;

    @Autowired
    public HelpController(HelpService service) {
        this.service = service;
    }

    @GetMapping(value = "/help/{city}")
    @ResponseBody
    public List<HelpInfo> getHelp(@PathVariable String city) {
        return service.get(city);
    }

    @GetMapping(value = "/help")
    @ResponseBody
    public List<HelpInfo> getAllHelp() {
        return service.getAll();
    }
}