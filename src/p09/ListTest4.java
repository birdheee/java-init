package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 3개를 , 기준으로 입력하세요 : ");
		String num = scan.nextLine();
		String[] numStr = num.split(",");
		
		for(int i=0; i<numStr.length; i++) {
			int numInt = Integer.parseInt(numStr[i]);
			numList.add(numInt);
		}
		
		// 출력
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
		System.out.print("숫자 3개를 , 기준으로 입력하세요 : ");
		String num2 = scan.nextLine();
		String[] numStr2 = num2.split(",");
		
		int cnt = 0;
		for(int i=0; i<numStr2.length; i++) {
			int numInt = Integer.parseInt(numStr2[i]);
//			중복값 세기
//			for(int j=0; j<numList.size(); j++) {
//				if(numList.get(j) == numInt) {
//					cnt ++;
//				}
//			}
			// 더 간단한 방법 !
			if(numList.indexOf(numInt) != -1) {
				cnt ++;
			}
		}
		System.out.print(cnt);
		
	}

}
