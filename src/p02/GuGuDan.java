package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-9까지 숫자 입력 : ");
		String numStr = scan.nextLine();
		System.out.println("니가 입력한 숫자 : " + numStr);
		int numInt = Integer.parseInt(numStr);
		for(int i=1; i<10; i++) {
			System.out.println(numInt + " X " + i + " = " + (numInt * i));
		}
	}
}