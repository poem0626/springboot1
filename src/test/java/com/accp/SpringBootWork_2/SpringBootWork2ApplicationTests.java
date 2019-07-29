package com.accp.SpringBootWork_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.SpringBootWork_2.biz.RecordBiz;
import com.accp.SpringBootWork_2.vo.RecordVo;
import com.github.pagehelper.PageInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWork2ApplicationTests {

	@Autowired
	private RecordBiz re;
	@Test
	public void contextLoads() {
		PageInfo<RecordVo> pageInfo2 = re.selectByPrimaryKey(1, 3, 1000, null, null);
		for (RecordVo i : pageInfo2.getList()) {
			System.err.println(i);
		}
	}

}
