package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random ra = new Random();
		
		// if문 두개는 AND 연산으로, 더 빠른 연산을 앞에다가, continue 사용
		while(numList.size()<50) {
			int raNum = ra.nextInt(200) + 1;
			if(raNum%2 == 0 && numList.indexOf(raNum) == -1) continue;
			numList.add(raNum);
		}
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}

}
