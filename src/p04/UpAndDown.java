package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	
	public static int getRandom(int max) {
		Random random = new Random();
		int rNum = random.nextInt(max) + 1;
		return rNum;
	}
	
	public static boolean match(int num1, int num2) {
		if(num1 == num2) {
			return true;
		}
		if(num1 > num2) {
			System.out.println("업");
		}else {
			System.out.println("다운");
		}
		return false;
	}

	public static void main(String[] args) {
		// 랜덤 생성
		int rNum = getRandom(50);
		Scanner scan = new Scanner(System.in);
		int numInt = 0;
		
		while(!match(rNum, numInt)) {
			System.out.print("1-50 : ");
			String numStr = scan.nextLine(); // 입력 받기
			numInt = Integer.parseInt(numStr); // integer로 변환
		}
		System.out.println("맞췄다!");
	}
}