package com.jyn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {
	public static void main(String[] args) {
		new BaseDAO().getCon();
	}

	private Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/CRMS", "root", "root");
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

	public ResultSet executeQuery(String sql, Object[] objs) {
		ResultSet rs = null;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i + 1, objs[i]);
			}
			rs = ps.executeQuery();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rs;
	}

	public void executeUpdate(String sql, Object[] objs) {
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i + 1, objs[i]);
			}
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				getCon().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
