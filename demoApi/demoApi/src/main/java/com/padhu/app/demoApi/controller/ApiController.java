package com.padhu.app.demoApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
    @GetMapping(value = "/")
    public String getMessage(){
        return(" rest api");
    }
}
