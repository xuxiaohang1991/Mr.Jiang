package com.jyn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyn.service.TypeDetailsVOService;
import com.jyn.service.TypeService;

@Controller
public class TypeDetailsVOController { 
	private TypeDetailsVOService  typeDetailsVOService=null;
private TypeService typeService=null; 
	
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}  
	public void setTypeDetailsVOService(TypeDetailsVOService typeDetailsVOService) {
		this.typeDetailsVOService = typeDetailsVOService;
	} 
	@RequestMapping("/query.action")
	public String queryTypeDetailsVO(HttpServletRequest request)
	{
		request.getSession().setAttribute("types",typeService.queryType());
		request.getSession().setAttribute("tdvos", typeDetailsVOService.queryTypeDetailsVO());
		return "/query"; 
	} 
}