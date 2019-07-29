package com.accp.SpringBootWork_2.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.SpringBootWork_2.dao.RecordDAO;
import com.accp.SpringBootWork_2.dao.StudentDAO;
import com.accp.SpringBootWork_2.pojo.Record;
import com.accp.SpringBootWork_2.vo.RecordVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class RecordBiz {
	@Autowired
	private RecordDAO dao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(Record record) {
    	return dao.insertSelective(record);
    }

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByPrimaryKey(Integer id){
    	return dao.deleteByPrimaryKey(id);
    }

	public PageInfo<RecordVo> selectByPrimaryKey(Integer p,Integer s,Integer stuCode,String name,String sname){
    	PageHelper.startPage(p, s);
    	return new PageInfo<RecordVo>(dao.selectByPrimaryKey(stuCode, name, sname));
    }

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByPrimaryKeySelective(Record record){
    	return dao.updateByPrimaryKeySelective(record);
    }

	

	public Record getRecord(Integer id) {
    	return dao.getRecord(id);
    }
}
