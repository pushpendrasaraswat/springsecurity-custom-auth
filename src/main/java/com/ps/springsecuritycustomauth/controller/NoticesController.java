package com.ps.springsecuritycustomauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    String getNotices() {
        return "Here are notices detils from DB";
    }
}
