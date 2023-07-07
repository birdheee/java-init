package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Join {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("NAME : ");
		String uiName = scan.nextLine();
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PWD : ");
		String uiPwd = scan.nextLine();
		
		String sql = "INSERT INTO user_info(UI_NAME, UI_ID, UI_PWD) ";
		sql += " VALUES('" + uiName + "', '" + uiId + "', '" + uiPwd + "')";
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