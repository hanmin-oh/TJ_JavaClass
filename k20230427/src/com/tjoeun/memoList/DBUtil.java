package com.tjoeun.memoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	// MYSQL에 연결하는 Connection을 만들어 리턴하는 메소드
	public static Connection getMySQLConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //mysql 5.x 사용자
			//Class.forName("com.mysql.cj.jdbc.Driver"); //mysql 8.x 사용자
			String url = "jdbc:mysql://localhost:3306/javaam?useUnicode=true&characterEncoding=UTF-8";
			conn = DriverManager.getConnection(url, "root", "0000");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("드라이버 클래스나 DB에 오류가 있습니다.");
		} 
		return conn;
	}
	
	//데이터베이스 작업에 사용한 객체를 닫는 메소드
	public static void close(Connection conn) {
		if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } } 
	}
	public static void close(Statement stmt) {
		if (stmt != null) { try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); } } 
	} 
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } } 
	}	
	public static void close(ResultSet rs) {
		if (rs != null) { try { rs.close(); } catch (SQLException e) { e.printStackTrace(); } } 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
