package com.accp.SpringBootWork_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.SpringBootWork_2.pojo.Student;
import com.accp.SpringBootWork_2.pojo.User;

public interface StudentDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    User login(@Param("uname") String uname,@Param("upwd") String upwd);
}