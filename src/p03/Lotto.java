package p03;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random();
		
		
		// 입력
		for(int i=0; i<lotto.length; i++) {
			int rNum = random.nextInt(6) + 1;
			// 중복 제거
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			if(lotto[i]==0) {
				lotto[i] = rNum;
			}
		}
		
		// 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
		
	}

}
