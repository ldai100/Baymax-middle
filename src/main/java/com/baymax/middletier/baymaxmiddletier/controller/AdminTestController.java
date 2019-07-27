package com.baymax.middletier.baymaxmiddletier.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminTestController {
    @GetMapping("/get/test")
    public String getMessage() {
        return "Hello from admin API controller";
    }

    @PostMapping("/post/test")
    String postMessage(@RequestBody String str){
        return "string recieved " + str;
    }


}
