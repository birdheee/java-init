package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Pokemon {
	public static void main(String args[]) {
		Map<String, String> m = new HashMap<>();
		m.put("이름", "피카츄");
		m.put("타입", "전기");
		m.put("특성", "정전기");
		m.put("분류", "쥐포켓몬");
		m.put("키", "0.4m");
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("이름", "꼬부기");
		m1.put("타입", "물");
		m1.put("특성", "급류");
		m1.put("분류", "꼬마거북포켓몬");
		m1.put("키", "0.5m");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("이름", "파이리");
		m2.put("타입", "불꽃");
		m2.put("특성", "맹화");
		m2.put("분류", "도롱뇽포켓몬");
		m2.put("키", "0.6m");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("이름", "디그다");
		m3.put("타입", "땅");
		m3.put("특성", "모래숨기");
		m3.put("분류", "두더지포켓몬");
		m3.put("키", "0.2m");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		for(Map<String, String> map : mapList) {
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key));
			}
			System.out.println();
		}
	}
}
