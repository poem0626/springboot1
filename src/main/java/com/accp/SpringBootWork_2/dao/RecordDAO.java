package com.accp.SpringBootWork_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.SpringBootWork_2.pojo.Record;
import com.accp.SpringBootWork_2.vo.RecordVo;

public interface RecordDAO {

    int insert(Record record);

    int insertSelective(Record record);

    int deleteByPrimaryKey(Integer id);
    
    Record getRecord(@Param("id")Integer id);

    List<RecordVo> selectByPrimaryKey(@Param("stuCode")Integer stuCode,@Param("name")String name,@Param("sname")String sname);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}