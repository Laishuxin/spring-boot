package com.imooc.springbootlearn.service;

import com.imooc.springbootlearn.mapper.StudentMapper;
import com.imooc.springbootlearn.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student getStudent(Integer id) {
        System.out.println("id = " + id);
        return studentMapper.findById(id);
    }

}
