package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-9 숫자를 입력 : ");
		String numStr = scan.nextLine();
		System.out.println("입력한 숫자 : " + numStr);
		
		try {
			int numInt = Integer.parseInt(numStr);
			for(int i=1; i<10; i++) {
				System.out.println(i + " X " + numInt + " = " + (i*numInt));
			}
		}catch(NumberFormatException e){
			System.out.println("오류");
		}
		
		
	}
}