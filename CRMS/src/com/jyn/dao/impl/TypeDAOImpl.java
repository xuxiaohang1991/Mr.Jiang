package com.jyn.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jyn.bean.Type;
import com.jyn.dao.BaseDAO;
import com.jyn.dao.TypeDAO;

public class TypeDAOImpl implements TypeDAO {
	private BaseDAO baseDAO = null;

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	ResultSet rs = null;

	public List<Type> queryType() {
		// TODO Auto-generated method stub
		List<Type> types = new ArrayList<Type>();
		String sql = "select * from chemType";
		Object[] objs = {};
		rs = baseDAO.executeQuery(sql, objs);
		try {
			while (rs.next()) {
				Type type = new Type();
				type.setTid(rs.getInt("t_id"));
				type.setTname(rs.getString("t_name"));
				types.add(type);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return types;
	}

}
