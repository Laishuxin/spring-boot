package com.imooc.springbootlearn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${student.grade}")
    Integer grade;
    @Value("${student.className}")
    String className;

    static Integer age;

    @GetMapping("/test-properties")
    public String testProperties() {
        return "grade: " + grade + ", className: " + className + ", age: " + age;
    }

    @Value("${student.age}")
    public void setAge(Integer age) {
        PropertiesController.age = age;
    }
}
