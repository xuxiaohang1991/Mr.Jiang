package com.jyn.service.impl;

import com.jyn.bean.Details;
import com.jyn.dao.DetailsDAO;
import com.jyn.service.DetailsService;

public class DetailsServiceImpl implements DetailsService {
	private DetailsDAO detailsDAO = null;
	
	public DetailsDAO getDetailsDAO() {
		return detailsDAO;
	}

	public void setDetailsDAO(DetailsDAO detailsDAO) {
		this.detailsDAO = detailsDAO;
	}

	public void add(Details details) {
		detailsDAO.add(details);
	}

	public void modify(Details details) {
		detailsDAO.modify(details); 		
	}

	public Details queryById(Integer id) {
		
		return detailsDAO.queryById(id);
	}

	public void remove(Integer id) {
		detailsDAO.remove(id);
		
	}

}
