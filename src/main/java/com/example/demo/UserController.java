package com.example.demo;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<User> hello() {
        User user = new User("cris", "and");
        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));
    }
}
