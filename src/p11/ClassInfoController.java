package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	
	public List<Map<String, String>> getClassInfoList(Map<String, String> param){
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfoList(param);
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String, String> param = new HashMap<>();
//		param.put("ciName", "재석");
		param.put("ciDesc", "뚜기");
		List<Map<String, String>> classInfoList = ciController.getClassInfoList(param);
		for(Map<String, String> classInfo : classInfoList) {
			System.out.println(classInfo);
		}
	}

}
