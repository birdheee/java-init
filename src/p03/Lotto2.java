package p03;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// 1-40
		// 7개
		
		Random random = new Random();
		int[] lotto = new int[7];
		
		// 입력
		for(int i=0; i<lotto.length; i++) {
			int rNum = random.nextInt(40) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			if(lotto[i] == 0) {
				lotto[i] = rNum;
			}
			
		}
		
		// 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}

}
