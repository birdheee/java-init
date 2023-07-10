package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Model
// View
// Controller
// 순서 : Controller -> Service -> Repository -> Service -> Controller

public class UserInfoController {
	public List<Map<String, String>> getUserInfoList(Map<String, String> param){
		// 참조형은 null 대입이 되고, 기본형은 안됨
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.deleteUserInfo(userInfo);
	}
	
	public static void main(String args[]) {
		// non-static 이므로 메모리 생성
		UserInfoController uiController = new UserInfoController();
		Map<String, String> param = new HashMap<>();
		
		// insert
//		param.put("uiName", "Belle");
//		param.put("uiId", "TEST4");
//		param.put("uiPwd", "TEST4");
//		int userInfo = uiController.insertUserInfo(param);
//		System.out.println("반영된 행 개수 : " + userInfo);
		
		// delete
		param.put("uiId", "TEST4");
		param.put("uiPwd", "TEST4");
		int userInfo = uiController.deleteUserInfo(param);
		System.out.println("반영된 행 개수 : " + userInfo);
		
		// select
		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for(Map<String, String> map : userInfoList) {
			System.out.println(map.get("uiNum") 
					+ "\t" + map.get("uiName") 
					+ "\t" + map.get("uiId") +
					"\t" + map.get("uiPwd"));
		}
	}
}