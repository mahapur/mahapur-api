package com.example.controller;

import com.example.model.Greeting;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @PostMapping("/")
    @ResponseBody
    public Greeting index() {
        final int no = (int) ((Math.random() * 10)%3);
        if (no == 0) {
            return new Greeting("Good Morning");
        } else if (no == 1) {
            return new Greeting("Good Afternoon");
        }
        return new Greeting("Good Night");
    }
}