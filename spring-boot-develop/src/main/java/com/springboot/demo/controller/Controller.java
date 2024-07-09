package com.springboot.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "*")
@RequestMapping("/spring-boot")
public class Controller {
    @GetMapping()
    public String Hello(){
        log.info("Info level of logging");
        log.warn("Warning level of logging");
        log.error("Error level of logging");
        return "Hello World!";
    }
}
