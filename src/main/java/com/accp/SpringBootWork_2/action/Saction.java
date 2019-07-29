package com.accp.SpringBootWork_2.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.SpringBootWork_2.biz.RecordBiz;
import com.accp.SpringBootWork_2.biz.StuBiz;
import com.accp.SpringBootWork_2.pojo.Student;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/view")
public class Saction {
	@Autowired
	private StuBiz st;

	@Autowired
	private RecordBiz re;
	
	@GetMapping("login")
	public String goToLogin() {
		return "login";
	}
	
	@GetMapping("add")
	public String add(Model m) {
		PageInfo<Student> pageInfo = st.selectByPrimaryKey(1, 100);
		m.addAttribute("PAGE_INFO", pageInfo);
		m.addAttribute("flag", true);
		return "upAdd";
	}
	
	@GetMapping("up")
	public String up(Model m,Integer id) {
		m.addAttribute("flag", false);
		PageInfo<Student> pageInfo = st.selectByPrimaryKey(1, 100);
		m.addAttribute("PAGE_INFO", pageInfo);
		m.addAttribute("RE",re.getRecord(id));
		return "upAdd";
	}
}
