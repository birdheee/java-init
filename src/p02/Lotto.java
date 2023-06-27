package p02;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		// Math.random으로
//		for(int i=0; i<lotto.length; i++) { // 1부터 45까지 랜덤으로 6번
//			lotto[i] = (int)(45 * Math.random() + 1); //Math.random은 double 형태이고 범위가 0부터 0.9999... 까지임
//		}
		
		// util.Random으로
		Random ra = new Random();
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ra.nextInt(45) + 1; // 범위가 0부터 44까지이기 때문에 +1을 함 
		}
		
		// 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}
}