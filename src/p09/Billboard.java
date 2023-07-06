package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Billboard {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("title", "Last Night");
		m.put("singer", "Morgan Wallen");
		m.put("Rank", "1");
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("title", "Favorite Song");
		m1.put("singer", "Toosii");
		m1.put("Rank", "6");
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("title", "Cruel Summer");
		m2.put("singer", "Taylor Swift");
		m2.put("Rank", "13");
		
		Map<String, String> m3 = new HashMap<>();
		m3.put("title", "Cupid");
		m3.put("singer", "Fifty Fifty");
		m3.put("Rank", "24");
		
		Map<String, String> m4 = new HashMap<>();
		m4.put("title", "Dance the Hight");
		m4.put("singer", "Dua Lipa");
		m4.put("Rank", "31");
		
		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		System.out.println(mapList);
		
	}
}