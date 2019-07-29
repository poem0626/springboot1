package com.accp.SpringBootWork_2.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.SpringBootWork_2.biz.RecordBiz;
import com.accp.SpringBootWork_2.biz.StuBiz;
import com.accp.SpringBootWork_2.pojo.Record;
import com.accp.SpringBootWork_2.pojo.Student;
import com.accp.SpringBootWork_2.pojo.User;
import com.accp.SpringBootWork_2.vo.RecordVo;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.Session;

@Controller
@RequestMapping("/c/stu")
public class StuAction {
	@Autowired
	private StuBiz st;

	@Autowired
	private RecordBiz re;


	@GetMapping("stuList")
	public String getMessageList(Integer p, Integer s,Integer stuCode, Model model,HttpSession se) {
		PageInfo<Student> pageInfo = st.selectByPrimaryKey(p, s);
		model.addAttribute("PAGE_INFO", pageInfo);
		PageInfo<RecordVo> pageInfo2 = re.selectByPrimaryKey(p, s, stuCode, null, null);
		model.addAttribute("RecordList", pageInfo2);
		return "StudentSys";
	}

	@GetMapping("reList")
	public String getMessageList(Integer p, Integer s,Integer stuCode, String name,String sname, Model model,HttpSession se) {
		PageInfo<RecordVo> pageInfo = re.selectByPrimaryKey(p, s, 10, null, null);
		model.addAttribute("PAGE_INFO", pageInfo);
		return "sanctionSys";
	}
	
	@PostMapping("reList2")
	public String selectByPrimaryKey(Integer p, Integer s,RecordVo rec, Model model,HttpSession se) {
		PageInfo<RecordVo> pageInfo = re.selectByPrimaryKey(p, s, 10, rec.getName(), rec.getSname());
		model.addAttribute("PAGE_INFO", pageInfo);
		for (RecordVo i : pageInfo.getList()) {
			System.err.println(i);
		}
		return "sanctionSys";
	}
	
	
	@PostMapping("readd")
	public String getMessageList(Model m,Record rec,HttpSession se) {
		User u = (User)se.getAttribute("USERS");
		rec.setCreateBy(u.getUname());
		rec.setCreateDate(new Date());
		re.insertSelective(rec);
		return "redirect:/c/stu/reList?p=1&s=3";
	}

	@PostMapping("reup")
	public String updateByPrimaryKey(Model m,Record rec,HttpSession se) {
		User u = (User)se.getAttribute("USERS");
		rec.setCreateBy(u.getUname());
		rec.setCreateDate(new Date());
		re.updateByPrimaryKeySelective(rec);
		System.err.println("修改成功了！");
		return "redirect:/c/stu/reList?p=1&s=3";
	}
	
	@GetMapping("redel")
	public String removeMessageInfo2(Model m,Integer rid) {
		re.deleteByPrimaryKey(rid);
		return "redirect:/c/stu/reList?p=1&s=3";
	}


}
