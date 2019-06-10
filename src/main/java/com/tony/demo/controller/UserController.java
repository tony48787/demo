package com.tony.demo.controller;

import com.tony.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("")
    public List<User> getUsers() {
        return Stream.of(
                new User("t1", "desc t1"),
                new User("t1", "desc t1"),
                new User("t1", "desc t1")
        ).collect(Collectors.toList());
    }
}
