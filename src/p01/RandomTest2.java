package p01;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(10) + 1; // 1부터 10까지 난수 생성
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하고 엔터 : ");
		int num = Integer.parseInt(scan.nextLine()); // 비교를 위해 입력받은 String을 Integer로 변환 
		if(rNum == num) {
			System.out.println("맞췄다.");
		}else {
			System.out.println("틀렸다. 정답은 " + rNum);
		}
	}
}