package com.accp.SpringBootWork_2.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.SpringBootWork_2.dao.StudentDAO;
import com.accp.SpringBootWork_2.pojo.Student;
import com.accp.SpringBootWork_2.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StuBiz {
	@Autowired
	private StudentDAO dao;
	
    public User login( String uname,String upwd) {
    	return dao.login(uname, upwd);
    }
    

    public PageInfo<Student> selectByPrimaryKey(Integer p,Integer s){
    	PageHelper.startPage(p, s);
    	return new PageInfo<Student>(dao.selectByPrimaryKey());
    }
}
