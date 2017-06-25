package com.wanggang.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DB {

	static String DBDRIVER = "com.mysql.jdbc.Driver";
	static String DBURL = "jdbc:mysql://localhost:3306/bbs";
	static String DBUSERNAME = "root";
	static String DBPASSWORD = "123456";

	/**
	 * 开启数据库连接
	 * @return Connection 连接标示符
	 */
	public static Connection getConectDB() {
		Connection con = null;
		try {
			Class.forName(DBDRIVER);
			con = (Connection) DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * 关闭数据库连接
	 * @param con 连接标示符
	 */
	public static void closeDB(Connection con){
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
