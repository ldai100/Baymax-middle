package com.baymax.middletier.baymaxmiddletier.controller;

import com.baymax.middletier.baymaxmiddletier.dao.TestDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class PlublicTestController {

    @Autowired
    private TestDaoImpl testDao;

    @GetMapping("/get/test")
    public String getMessage() {
        return "Hello from public API controller";
    }

    @PostMapping("/post/test")
    String postMessage(@RequestBody String str){
        System.out.println(str);
        return "string recieved " + str;
    }

    @GetMapping("/testDB")
    public void testDB(){
        testDao.testConnection();
    }
}
