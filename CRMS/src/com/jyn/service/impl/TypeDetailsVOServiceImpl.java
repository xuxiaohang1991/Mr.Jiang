package com.jyn.service.impl;

import java.util.List;

import com.jyn.bean.TypeDetailsVO;
import com.jyn.dao.TypeDetailsVODAO;
import com.jyn.service.TypeDetailsVOService;

public class TypeDetailsVOServiceImpl implements TypeDetailsVOService{
	
	public TypeDetailsVOServiceImpl() {
		System.out.println("TypeDetailsVOServiceImpl");
	}

	private TypeDetailsVODAO typeDetailsVODAO = null;
	
	public TypeDetailsVODAO getTypeDetailsVODAO() {
		return typeDetailsVODAO;
	}

	public void setTypeDetailsVODAO(TypeDetailsVODAO typeDetailsVODAO) {
		this.typeDetailsVODAO = typeDetailsVODAO;
	}

	public List<TypeDetailsVO> queryTypeDetailsVO() {
		// TODO Auto-generated method stub
		return typeDetailsVODAO.queryTypeDetailsVO();
	}

}
