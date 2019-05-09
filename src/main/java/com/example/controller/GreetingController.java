package com.example.controller;

import com.example.model.Spend;
import com.example.repository.SpendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    private SpendRepository repository;

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Spend> index(@RequestParam("user_name") String userId,
                             @RequestParam("text") String text) {
        return repository.findAllSpend(userId);
    }
}