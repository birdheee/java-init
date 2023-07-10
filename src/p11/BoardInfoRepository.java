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

public class BoardInfoRepository {
	public List<Map<String, String>> getBoardInfoList(){
		List<Map<String, String>> list = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> map = new HashMap<>();
				map.put("biNum", rs.getString("BI_NUM"));
				map.put("biTitle", rs.getString("BI_TITLE"));
				map.put("biContent", rs.getString("BI_CONTENT"));
				map.put("biWriter", rs.getString("BI_WRITER"));
				map.put("biCredat", rs.getString("BI_CREDAT"));
				map.put("biCnt", rs.getString("BI_CNT"));
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insertBoardInfo() {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT) ";
			sql += " VALUES ('세번째 게시물', '냉삼', '끄적이', NOW(), 2)";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteBoardInfo() {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM board_info ";
			sql += " WHERE BI_TITLE LIKE '%세번째%'";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateBoardInfo(Map<String, String> boardInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "UPDATE BOARD_INFO SET ";
			if(boardInfo.get("biTitle") != null) {
				sql += " BI_TITLE='" + boardInfo.get("biTitle") + "',";
			}
			if(boardInfo.get("biContent") != null) {
				sql += " BI_CONTENT='" + boardInfo.get("biContent") + "',";
			}
			if(boardInfo.get("biWriter") != null) {
				sql += " BI_WRITER='" + boardInfo.get("biWriter") + "',";
			}
			if(boardInfo.get("biCnt") != null) {
				sql += " BI_CNT='" + boardInfo.get("biCnt") + "',";
			}
			sql = sql.substring(0, sql.length()-1); // 쉼표 빼기
			sql += " WHERE BI_NUM=" + boardInfo.get("biNum");
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static void main(String args[]) {
		BoardInfoRepository biRepo = new BoardInfoRepository();
		
		// select
		List<Map<String, String>> boardInfoList = biRepo.getBoardInfoList();
		for(Map<String, String> boardInfo : boardInfoList) {
			System.out.println(boardInfo);
		}
		
		// insert
//		int insertResult = biRepo.insertBoardInfo();
//		System.out.println("반영된 행 개수 : " + insertResult);
		
		// delete
//		int deleteResult = biRepo.deleteBoardInfo();
//		System.out.println("반영된 행 개수 : " + deleteResult);
		
		// update
//		Map<String, String> boardInfo = new HashMap<>();
//		boardInfo.put("biNum", "1");
//		boardInfo.put("biCnt", "1");
//		int updateResult = biRepo.updateBoardInfo(boardInfo);
//		System.out.println("반영된 행 개수 : " + updateResult);
	}
}