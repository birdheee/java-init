package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		// 예외처리를 강요함 !
		// 유심칩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 전화기
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java"); // 전화번호
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) VALUES('TEST2', 'TEST2', '연습2')"; // 쿼리문
			Statement stmt = con.createStatement(); // 연결한 후 쿼리 작성하는 곳을 만들어야 함
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 개수 : " + resultCnt);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}