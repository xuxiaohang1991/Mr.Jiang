package com.jyn.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jyn.bean.TypeDetailsVO;
import com.jyn.dao.BaseDAO;
import com.jyn.dao.TypeDetailsVODAO;

public class TypeDetailsVODAOImpl implements TypeDetailsVODAO {
	
	public TypeDetailsVODAOImpl() {
		System.out.println("TypeDetailsVODAOImpl");
	}

	private BaseDAO baseDAO = null;

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	ResultSet rs = null;

	public List<TypeDetailsVO> queryTypeDetailsVO() {
		List<TypeDetailsVO> typeDetailsVOs = new ArrayList<TypeDetailsVO>();
		String sql = "select t.t_id id,t_name tname," +
				"t_desc tdesc,d_name dname,d_desc ddesc" +
				",d_addr addr from chemType t,chemDetails d where t.t_id=d.t_id";
		Object[] objs = {};
		rs = baseDAO.executeQuery(sql, objs);
		try {
			while(rs.next()){
				
				TypeDetailsVO tdvo = new TypeDetailsVO(
						rs.getInt("id"),
						rs.getString("tname"),
						rs.getString("tdesc"),
						rs.getString("dname"),
						rs.getString("ddesc"),
						rs.getString("addr")
				);
				typeDetailsVOs.add(tdvo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return typeDetailsVOs;
	}

}
