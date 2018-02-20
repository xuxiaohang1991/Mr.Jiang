package com.jyn.service.impl;

import java.util.List;

import com.jyn.bean.Type;
import com.jyn.dao.TypeDAO;
import com.jyn.service.TypeService;

public class TypeServiceImpl implements TypeService {
	private TypeDAO typeDAO=null;
	
	public TypeDAO getTypeDAO() {
		return typeDAO;
	}

	public void setTypeDAO(TypeDAO typeDAO) {
		this.typeDAO = typeDAO;
	}

	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return typeDAO.queryType();
	}

}
