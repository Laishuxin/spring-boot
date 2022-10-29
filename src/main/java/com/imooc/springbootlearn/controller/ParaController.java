package com.imooc.springbootlearn.controller;

import com.imooc.springbootlearn.pojo.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParaController {
    @GetMapping("/first-request")
    public String firstRequest() {
        return "Hello Spring Boot";
    }

    @GetMapping("/para")
    public String requestPara(@RequestParam Integer num) {
        return "receive num: " + num;
    }

    @PostMapping("/body")
    public String requestBody(@RequestBody Student student) {
        return "receive num: " + student;
    }
}
