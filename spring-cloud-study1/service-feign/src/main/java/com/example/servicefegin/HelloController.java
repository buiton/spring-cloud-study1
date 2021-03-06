package com.example.servicefegin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    BaseFeign baseFeign;

    @RequestMapping(value = "/sayHi")
    public String hi(@RequestParam String name){
        return baseFeign.hi(name);
    }

}
