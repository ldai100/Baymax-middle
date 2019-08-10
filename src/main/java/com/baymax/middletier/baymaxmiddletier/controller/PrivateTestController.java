package com.baymax.middletier.baymaxmiddletier.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/private")
public class PrivateTestController {
    @GetMapping("/get/test")
    public String getMessage() {
        return "Hello from private API controller";
    }

    @PostMapping("/post/test")
    String postMessage(@RequestBody String str){
        return "string recieved " + str;
    }
}
