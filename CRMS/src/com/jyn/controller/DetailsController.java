package com.jyn.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyn.bean.Details;
import com.jyn.service.DetailsService;

@Controller
public class DetailsController {  
	private DetailsService detailsService=null;
	 
	public void setDetailsService(DetailsService detailsService) {
		this.detailsService = detailsService;
	}  
	@RequestMapping("/add.action")
	public String add(Details details)
	{
		detailsService.add(details);
		//redirect:�ض��򵽿�������һ��·��
		//return "redirect:/query.action"; 
		return "../index";
		//·��˼·���ӵ�ǰ·��WebRoot/jsp/query.jsp
		//������һ����../
	} 
	@RequestMapping("/remove.action")
	public String remove(Integer id)
	{
		detailsService.remove(id); 
		return "redirect:/query.action";  
	} 
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/queryById.action")
	public String queryById(Integer id,Map map)
	{
		map.put("details",detailsService.queryById(id)); 
		return "queryById";  
	} 
	@RequestMapping("/modify.action")
	public String modify(Details details)
	{
		detailsService.modify(details); 
		return "redirect:/query.action";  
	} 
}
