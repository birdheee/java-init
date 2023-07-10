package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;
//필요한 것 : DB 주소, 커넥션, 드라이버(jdbc 드라이버), 아이디 비밀번호

public class UserInfoRepository {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param){
		List<Map<String, String>> userInfos = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO ";
			if(param != null) { // null이 아님을 먼저 가정
				if(param.get("uiNum") != null) {
					sql += " WHERE UI_NUM LIKE '%" + param.get("uiNum") + "%'";
				}
				if(param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'";
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfos.add(userInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) ";
			sql += " VALUES('" + userInfo.get("uiName") + 
					"', '" + userInfo.get("uiId") + 
					"', '" + userInfo.get("uiPwd") +
					"')";
			int resultCnt = stmt.executeUpdate(sql);
			return resultCnt;
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM user_info ";
			sql += " WHERE UI_ID='" + userInfo.get("uiId") + "' AND UI_PWD='" + userInfo.get("uiPwd") + "'";
			int resultCnt = stmt.executeUpdate(sql);
			return resultCnt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
