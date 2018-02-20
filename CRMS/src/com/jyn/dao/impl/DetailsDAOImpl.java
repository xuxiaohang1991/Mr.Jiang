package com.jyn.dao.impl;

import java.sql.ResultSet;

import com.jyn.bean.Details;
import com.jyn.dao.BaseDAO;
import com.jyn.dao.DetailsDAO;

public class DetailsDAOImpl implements DetailsDAO {
	private BaseDAO baseDAO = null;

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}
	public void add(Details details) {
		String sql="insert into chemDetails(d_name,d_addr,d_desc,t_id)values(?,?,?,?)";
		Object[] objs={details.getDname(),details.getAddr(),details.getDdesc(),details.getTid()};
		baseDAO.executeUpdate(sql, objs);
	}

	public void modify(Details details) {
		String sql = "update chemDetails set d_name=?,d_addr=?,"
			+ "d_desc=? where d_id=?";
		Object[] objs={details.getDname(),details.getAddr(),details.getDdesc(),details.getTid()};

	baseDAO.executeUpdate(sql, objs);		
	}

	public Details queryById(Integer id) {
		Details details = null;
		String sql = "select * from chemDetails where d_id=?";
		Object[] objs = { id };
		ResultSet rs = baseDAO.executeQuery(sql, objs);
		try {
			if (rs.next()) {
				details = new Details(rs.getString("d_name"), rs
						.getString("d_addr"), rs.getString("d_desc"), rs
						.getInt("d_id"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return details;
	}

	public void remove(Integer id) {
		String sql = "delete from chemDetails where d_id=?";
		Object[] objs = { id };
		baseDAO.executeUpdate(sql, objs);		
	}

}
