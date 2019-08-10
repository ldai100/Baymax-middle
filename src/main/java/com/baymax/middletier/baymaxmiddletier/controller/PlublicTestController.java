package com.baymax.middletier.baymaxmiddletier.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class PlublicTestController {
    @GetMapping("/get/test")
    public String getMessage() {
        return "Hello from public API controller";
    }

    @PostMapping("/post/test")
    String postMessage(@RequestBody String str){
        System.out.println(str);
        return "string recieved " + str;
    }
}
