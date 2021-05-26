package com.bjsxt.service.impl;

import com.bjsxt.feign.StudentFeign;
import com.bjsxt.feign.StudentFeign2;
import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.StudentService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentFeign studentFeign;

    @Autowired
    private StudentFeign2 studentFeign2;

    @LcnTransaction
    @Override
    public Integer insert(Student student,String tname,String mname) {
        Integer insert = studentMapper.insert(student);
        if (insert == 1){
            studentFeign2.insert(mname);
            return studentFeign.insert(tname);
        }
        return 0;
    }
}
