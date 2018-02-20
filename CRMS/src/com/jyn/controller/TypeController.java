package com.jyn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyn.bean.Type;

@Controller
public class TypeController {  
	@RequestMapping("/queryType.action")
	public String queryType(Map<String,List<Type>> map)
	{ 
		return "/add"; //实现返回的是add.jsp  add.jsp==>add.jsp.jsp
	} 
}
