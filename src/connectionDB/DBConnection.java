package connectionDB;

import java.sql.*;

public class DBConnection {
	Connection conn =null;
	
	public Connection getDBConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.cj.jdbc.Driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ysu", "ysu","1234");
			System.out.println("DB 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		return conn;
		
		
	}
}
