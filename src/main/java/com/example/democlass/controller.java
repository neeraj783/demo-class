package com.example.democlass;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/hello")
    public String m1(){
        return ("<h1>*welcome neeraj*</h1>");
    }
}
