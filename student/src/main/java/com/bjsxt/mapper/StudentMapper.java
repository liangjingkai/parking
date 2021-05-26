package com.bjsxt.mapper;

import com.bjsxt.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    @Insert("insert into student values (default,#{name},#{tid})")
    Integer insert(Student student);
}
