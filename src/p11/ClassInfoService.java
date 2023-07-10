package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {
	public List<Map<String, String>> getClassInfoList(Map<String, String> param){
		ClassInfoRepository CiRepo = new ClassInfoRepository();
		return CiRepo.getClassInfoList(param);
	}
	
	public int insertClassInfo(Map<String, String> param) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.insertClassInfo(param);
	}
	
	public int deleteClassInfo(Map<String, String> param) {
		ClassInfoRepository cirepo = new ClassInfoRepository();
		return cirepo.deleteClassInfo(param);
	}

}
