package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	
	public List<Map<String, String>> getClassInfoList(Map<String, String> param){
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfoList(param);
	}
	
	public int insertClassInfo(Map<String, String> param) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.insertClassInfo(param);
	}
	
	public int deleteClassInfo(Map<String, String> param) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.deleteClassInfo(param);
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String, String> param = new HashMap<>();
		
		// insert
//		param.put("ciName", "정형돈");
//		param.put("ciDesc", "도니");
//		int classInfo = ciController.insertClassInfo(param);
//		System.out.println("반영된 행 개수 : " + classInfo);
		
		// delete
//		param.put("ciName", "정형돈");
//		int classInfo = ciController.deleteClassInfo(param);
//		System.out.println("반영된 행 개수 : " + classInfo);
		
		// select
//		param.put("ciName", "재석");
//		param.put("ciDesc", "식신");
		List<Map<String, String>> classInfoList = ciController.getClassInfoList(param);
		System.out.println("번호\t이름\t설명");
		for(Map<String, String> c : classInfoList) {
			System.out.println(c.get("ciNum") + 
					"\t" + c.get("ciName") + 
					"\t" + c.get("ciDesc"));
		}
	}

}
