package com.imooc.springbootlearn.controller;

import com.imooc.springbootlearn.pojo.Student;
import com.imooc.springbootlearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public String getStudentById(@RequestParam Integer id) {
        Student student = studentService.getStudent(id);
        return student != null ? student.toString() : "not found";
    }
}
