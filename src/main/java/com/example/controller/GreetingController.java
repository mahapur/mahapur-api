package com.example.controller;

import com.example.model.Greeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GreetingController {

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Greeting index(@RequestParam("user_name") String userName,
                          @RequestParam("text") String text) {
        final SpendInfo info = new SpendInfo(userName,Integer.parseInt(text));
        int amount = info.getAmount();
        if (amount == 0) {
            return new Greeting("Good Morning " + info);
        } else if (amount == 1) {
            return new Greeting("Good Afternoon " + info);
        }
        return new Greeting("Good Night " + info);
    }
}