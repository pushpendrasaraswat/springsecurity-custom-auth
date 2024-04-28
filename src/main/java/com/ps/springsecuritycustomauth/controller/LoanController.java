package com.ps.springsecuritycustomauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loanDetails")
    String getLoanDetails() {
        return "Here are my locan details";
    }
}
