package com.racine.controller;

import com.racine.beans.Greeting;
import com.racine.beans.UserInfo;
import com.racine.mapper.UserMapper;
import com.racine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sunrx on 2016/9/22.
 */
@RestController
public class GreetingController {
    private String template = "Hello,%s!";
    private AtomicLong counter = new AtomicLong();

    @Autowired
    private UserService userService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world", required = false) String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/user")
    public UserInfo getUser(@RequestParam(value = "id", defaultValue = "1", required = false) int id) {
        return userService.getUser(id);
    }
}
