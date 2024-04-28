package com.ps.springsecuritycustomauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/myCards")
    String getCardDetails() {
        return "Here are my card details";
    }
}
