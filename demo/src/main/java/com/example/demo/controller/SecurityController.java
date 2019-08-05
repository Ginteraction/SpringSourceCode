package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
@RestController
public class SecurityController {

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public String currentUserName() {
        return "12322282";
//        return principal.getName();
    }

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password() {
        return "password";
//        return principal.getName();
    }
}
