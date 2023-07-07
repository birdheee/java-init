package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	// 잘 바뀔 일이 없음 -> 상수 사용
	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";
	
	// 즉시 실행 영역. main 메소드를 실행하는 것만으로도 이 영역이 실행됨
	static {
		try {
			Class.forName(DRIVER_CLASS);
			System.out.println("내가 나오면 드라이버 잘 찾은거임");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// 데이터베이스를 연결하는 메서드
	public static Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		
	}

}
