package com.wanggang.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.wanggang.model.BbsArtic;
import com.wanggang.util.DB;

//bbs业务方法
public class BbsArticService {

	/**
	 * 得到所有的文章
	 * 
	 * @return
	 */
	public static List getAll() {
		List lists = new ArrayList();
		com.mysql.jdbc.Connection con = DB.getConectDB();
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String sql = "select * from artic";
		try {
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				BbsArtic ba = new BbsArtic();
				ba.setId(rs.getInt("id"));
				ba.setName(rs.getString("name"));
				ba.setDescription(rs.getString("description"));
				lists.add(ba);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lists;
	}

	/**
	 * 通过ID得到某一个文章
	 * 
	 * @param id
	 * @return
	 */
	public static BbsArtic getBbsArticById(String id) {
		com.mysql.jdbc.Connection con = DB.getConectDB();
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String sql = "select *from artic where id = " + id;

		BbsArtic ba = new BbsArtic();
		try {
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				ba.setId(rs.getInt("id"));
				ba.setName(rs.getString("name"));
				ba.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ba;
	}

	/**
	 * 通过id删除文章
	 * 
	 * @param id
	 *            文章ID
	 */
	public static void deleteById(String id) {
		com.mysql.jdbc.Connection con = DB.getConectDB();
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String sql = "delete from artic where id = " + id;

		try {
			st.executeUpdate(sql);
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 编辑某一个文章
	 * 
	 * @param id
	 *            文章ID
	 * @param name
	 *            文章的新名字
	 * @param description
	 *            文章的新说明
	 */
	public static void update(String id, String name, String description) {
		com.mysql.jdbc.Connection con = DB.getConectDB();
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String sql = "update artic set name = '" + name + "',description = '" + description + "' where id = " + id;
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void add(String name, String description) {
		com.mysql.jdbc.Connection con = DB.getConectDB();
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String sql = "insert into artic values(null,'"+name+"','"+description+"')";

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
