package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
	public static void main(String args[]) {
		// map은 데이터를 정의하기 위해 사용함
		// map은 다이아몬드에 key, value 두 개가 들어갈 수 있음
		Map<String, Integer> map = new HashMap<>();
		map.put("age", 33);
		map.put("like", 7);
		map.put("rank", 11);
		
		// map은 인덱스 개념이 없음. 즉, 순서를 알 수가 없음
		// value를 가져오려면 반드시 key를 알아야 함
		// key의 대소문자, 공백을 구별함
		System.out.println(map.get("age")); // 33
		System.out.println(map.get("like")); // 7
		System.out.println(map.get("rank")); // 11
		
		// 내부적인 구조가 key 배열, value 배열로 저장되어 있음
		// 나오는 순서가 없기에 뽑아야 함 iterator pattern
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator(); // key에 대한 set으로 되어있음
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
