package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		
//		numlist의 size가 20이 될 때 까지 랜덤 값을 1에서 100까지 저장
//		단 중복 안됨
//		출력할 때 for문으로 출력
//		숫자에 3,6,9가 포함되어 있는 경우 짝, 두개 포함되어 있는 경우 짝짝
		List<Integer> numList = new ArrayList<>();
		Random ra = new Random();
		while(numList.size()<20) {
			int raNum = ra.nextInt(100) + 1;
			if(numList.indexOf(raNum) == -1) {
				numList.add(raNum);
			}
		}
		System.out.println(numList);
		
		// 첫번째 방법
		for(int i=0; i<numList.size(); i++) {
			int num = numList.get(i);
			int mod = num % 10;
			int quo = num / 10;
			if((mod == 3  || mod == 6 || mod == 9) &&
				(quo ==  3 || quo ==  6 || quo ==  9)) {
				System.out.println("짝짝");
			}else if(mod == 3 || mod == 6 || mod == 9 ||
					quo ==  3 || quo ==  6 || quo ==  9){
				System.out.println("짝");
			}else {
				System.out.println(numList.get(i));
			}
		}
		
		// 두번째 방법
		// Integer는 toString을 지원함
		for(int i=0; i<numList.size(); i++) {
			String numStr = numList.get(i).toString();
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numStr);
		}
		
	}

}
