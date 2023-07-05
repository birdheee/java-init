package p08;

import java.util.ArrayList;

public class ListTest {
	public static void main(String avg[]) {
		String str1 = "안녕.";
		String str2 = " 내 소개를";
		String str3 = " 하지.";
		String str4 = " 내 직업은";
		String str5 = " 래퍼야.";
		
		String[] strs = new String[5];
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;
		
		System.out.println(strs); // 주소가 출력
		
		for(int i=0; i<strs.length; i++) {
			System.out.print(strs[i]);
		}
		
		// ArrayList는 방 개수를 지정해놓지 않아도 됨, 처음 size는 0
		// 순차적으로 넣고, 출력하는 경우에 사용함
		// <> 다이아몬드에는 참조형만 들어갈 수 있음
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("일"); // String만 저장 가능
		strList.add("이");
		strList.add("삼");
		strList.add("사");
		System.out.println(strList.size()); // 4
		strList.remove(0); // 0번째를 제거
		System.out.println(strList.size()); // 3
		System.out.println(strList); // 값이 나옴
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i)); // 출력하려면 get
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1); // int만 저장 가능
			
	}
}