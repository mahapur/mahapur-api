package com.example.controller;

import com.example.controller.parser.SpendParser;
import com.example.model.Spend;
import com.example.model.SpendInfo;
import com.example.service.SpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpendController {
    private SpendParser spendParser;
    private SpendService service;

    @Autowired
    public SpendController(SpendParser spendParser, SpendService service) {
        this.spendParser = spendParser;
        this.service = service;
    }

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SpendInfo addSpend(@RequestParam("user_name") String userId,
                              @RequestParam("text") String text) {
        if ("get".equalsIgnoreCase(text)) {
            return service.get(userId);
        }
        final Spend spend = spendParser.parse(userId, text);
        return service.addSpend(spend);
    }
}