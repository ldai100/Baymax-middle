package com.baymax.middletier.baymaxmiddletier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PlublicTestController {
    @GetMapping("/get/test")
    public String getMessage() {
        return "Hello from public API controller";
    }

    @PostMapping("/post/test")
    String postMessage(String str){
        return "string recieved" + str;
    }
}
