package com.ntcc.accountweb.controller;

import com.ntcc.accountweb.service.AccountWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountWeb accountWeb;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(String message) {
        return accountWeb.register(message);
    }
}
