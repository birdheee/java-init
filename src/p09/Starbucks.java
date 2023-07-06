package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starbucks {
	
	public static void main(String args[]) {
		Map<String, String> m = new HashMap<>();
		m.put("상품 이름", "아이스 아메리카노");
		m.put("분류", "음료");
		m.put("카테고리", "에스프레소");
		m.put("가격", "4500");
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("상품 이름", "자몽 허니 블랙티");
		m1.put("분류", "음료");
		m1.put("카테고리", "티");
		m1.put("가격", "5700");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("상품 이름", "돌체 라떼");
		m2.put("분류", "음료");
		m2.put("카테고리", "에스프레소");
		m2.put("가격", "5900");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("상품 이름", "바질 토마토 크림치즈 베이글");
		m3.put("분류", "푸드");
		m3.put("카테고리", "브레드");
		m3.put("가격", "5900");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("상품 이름", "슈크림 가득 바움쿠헨");
		m4.put("분류", "푸드");
		m4.put("카테고리", "케이크");
		m4.put("가격", "6900");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		System.out.println(mapList);
	}
	
}
