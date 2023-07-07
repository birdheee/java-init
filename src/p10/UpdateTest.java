package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	// update만 cell 기반임
	public static void main(String args[]) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			String sql = "UPDATE user_info SET UI_NAME='동이' WHERE UI_NUM=6";
			Statement stmt = con.createStatement();
			int resultCount = stmt.executeUpdate(sql);
			System.out.println("반영된 행 개수 : " + resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}