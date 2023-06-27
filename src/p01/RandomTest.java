package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = r.nextInt(10) + 1; // 0부터 9까지의 난수 생성, +1하면 1부터 10까지의 난수 생성
			System.out.println(arr[i]);
		}
	}
}