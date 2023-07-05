package p08;

/* Collection Framework
 * List, Map, Set 은 interface이다. 
 * 즉, 메모리 생성이 되지 않는다. 생성자를 만들지 못함
 * ArrayList 클래스는 List interface를 구현하고 있음
 * */

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>(); // 1.7 이상부터 생략 가능
		List<String> strList2 = new ArrayList<>();
		strList2.add("안녕");
		System.out.println(strList2.get(0));
		strList2.remove(0);
//		System.out.println(strList2.get(0)); // out of bounds 오류
	}
}
