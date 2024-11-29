package com.fsv.api.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/healthCheck")
    String test() {

        return "ok";
    }
}
