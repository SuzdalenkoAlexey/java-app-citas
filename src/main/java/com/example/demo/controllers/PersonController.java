package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @GetMapping("get_or_create_user")
    public String getOrCreateUser(){
        return "get or create";
    }

}
