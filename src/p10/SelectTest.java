package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			String sql = "SELECT * FROM user_info";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // executeQuery의 데이터형은 ResultSet. ResultSet는 메타데이터와 실제데이터를 가지고 있음
			while(rs.next()) { // rs.next는 boolean 형임
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				String uiName = rs.getString("UI_NAME");
				int uiNum = rs.getInt("UI_NUM");
				System.out.print("uiId : " + uiId + ", ");
				System.out.print("uiPwd : " + uiPwd + ", ");
				System.out.print("uiName : " + uiName + ", ");
				System.out.println("uiNum : " + uiNum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}