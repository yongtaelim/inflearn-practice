package com.example.inflearnpractice.cookies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/cookies")
public class CookieController {

    @GetMapping
    public ResponseEntity getCookies() {
        return null;
    }

}
