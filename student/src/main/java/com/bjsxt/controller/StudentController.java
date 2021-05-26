package com.bjsxt.controller;

import com.bjsxt.pojo.Student;
import com.bjsxt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/insert1")
    public Integer insert(Student student,String tname,String mname){
        return studentService.insert(student,tname,mname);
    }
}
