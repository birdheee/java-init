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

public class ClassInfoRepository {
	public List<Map<String, String>> getClassInfoList(Map<String, String> param){
		List<Map<String, String>> ClassInfos = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM CLASS_INFO ";
			if(param != null) {
				if(param.get("ciName") != null) {
					sql += " WHERE CI_NAME LIKE '%" + param.get("ciName") + "%'";
				}
				if(param.get("ciDesc") != null) {
					sql += " WHERE CI_DESC LIKE '%" + param.get("ciDesc") + "%'";
				}
				
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> ClassInfo = new HashMap<>();
				ClassInfo.put("ciNum", rs.getString("CI_NUM"));
				ClassInfo.put("ciName", rs.getString("CI_NAME"));
				ClassInfo.put("ciDesc", rs.getString("CI_DESC"));
				ClassInfos.add(ClassInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ClassInfos;
	}
	
	public int insertClassInfo(Map<String, String> param) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO CLASS_INFO(CI_NAME, CI_DESC) ";
			sql += " VALUES('" + param.get("ciName") + "', '" + param.get("ciDesc") + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteClassInfo(Map<String, String> param) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM CLASS_INFO ";
			sql += " WHERE CI_NAME='" + param.get("ciName") + "'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return 0;
	}
}
