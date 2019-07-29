package com.accp.SpringBootWork_2.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.SpringBootWork_2.biz.StuBiz;
import com.accp.SpringBootWork_2.dao.StudentDAO;
import com.accp.SpringBootWork_2.pojo.User;


@Controller
@RequestMapping("/c/users")
public class UersAction {
	
	@Autowired
	private StuBiz s;

	@PostMapping("loginIn")
	public String login(Model model,User u, HttpSession session) {
		User u1 = s.login(u.getUname(), u.getUpwd());
		if(u1!=null) {
			session.setAttribute("USERS",u1);
			return "redirect:/c/stu/stuList?p=1&s=3&stuCode=0";
		}else {
			model.addAttribute("MSG", "用户名或密码错误");
			return "login";//必须是模板文件名【转发】
		}
	}


}
