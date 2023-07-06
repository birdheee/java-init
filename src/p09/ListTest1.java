package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		// 랜덤 값 정의 
		List<Integer> numList = new ArrayList<>();
		Random ra = new Random();
		
		// size가 6이 될 때까지
		while(numList.size()<7) {
			int raNum = ra.nextInt(100)+1;
			if(numList.indexOf(numList) == -1) {
				numList.add(raNum);
			}
		}
		
		// 리스트 출력
		System.out.println(numList);
		
		// 최소값, 최대값 찾기
		int min = numList.get(0);
		int max = numList.get(0);
		for(int i=1; i<numList.size(); i++) {
			if(min > numList.get(i)) {
				min = numList.get(i);
			}
			if(max < numList.get(i)) {
				max = numList.get(i);
			}
		}
		// 최소값, 최대값 출력
		System.out.println(min);
		System.out.println(max);
		
		
	}

}
