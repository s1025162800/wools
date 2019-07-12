package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pojo.Student;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String  main() {
		Student stu = new Student();
		stu.setName("张三");
		stu.setPassword("root");
		String str1=JSON.toJSONString(stu);
		System.out.println(str1);
		return "NBA.jsp";
				
	}

}
