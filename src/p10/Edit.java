package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Edit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 PWD : ");
		String uiPwd = scan.nextLine();
		System.out.print("새 PWD : ");
		String newPwd = scan.nextLine();
		
		String sql = "UPDATE user_info SET ";
		sql += " UI_PWD='" + newPwd + "' WHERE UI_PWD='" + uiPwd + "'";
		
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt = con.createStatement();
			int resultCount = stmt.executeUpdate(sql);
			System.out.println("반영된 행 개수 : " + resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
