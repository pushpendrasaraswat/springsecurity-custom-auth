package com.ps.springsecuritycustomauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    String getBalanceDetails() {
        return "Here are my Balance details";
    }
}
