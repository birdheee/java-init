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
		return 0;
	}
	public int deleteUserInfo(Map<String, String> userInfo) {
		return 0;
	}
	public static void main(String args[]) {
		// non-static 이므로 메모리 생성
		UserInfoController uiController = new UserInfoController();
		Map<String, String> param = new HashMap<>();
		param.put("uiNum", "12");
//		param.put("uiName", "Bentely");
		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for(Map<String, String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") 
					+ "\t" + userInfo.get("uiName") 
					+ "\t" + userInfo.get("uiId") +
					"\t" + userInfo.get("uiPwd"));
		}
	}
}