package p02;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = r.nextInt(45) + 1;
		}

		for(int i=0;i<lotto.length;i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}
}
