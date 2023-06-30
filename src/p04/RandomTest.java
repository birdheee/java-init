package p04;

import java.util.Random;
import java.util.Scanner;

//1 -> 가위
//2-> 바위
//3-> 보
public class RandomTest {
	
	public static String getRock() {
		Random random = new Random();
		int rockNum = random.nextInt(3)+1;
		if(rockNum == 1) {
			return "가위";
		}
		if(rockNum == 2) {
			return "바위";
		}
		if(rockNum == 3) {
			return "보";
		}
		// 자바가 보기에 아무것도 return 하지 않을 수도 있기 때문에 에러가 뜸
		return ""; // 이렇게 해줘야 함
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("샘 : 얘들아~ 가위, 바위, 보 하자.");
		System.out.println("윌리엄 : 네~");
		System.out.println("벤틀리 : 시러~");
		System.out.print("윌리엄 : ");
		String myRock = scan.nextLine();
		
		String getRock = getRock();
		System.out.println("벤틀리 : " + getRock);
		
		// 결과 비교		
		if(getRock.equals(myRock)) {
			System.out.println("윌리엄 : 비겼다~ 우리는 샴쌍둥이.");
		}else if((myRock.equals("가위") && getRock.equals("보")) || 
				(myRock.equals("바위") && getRock.equals("가위")) || 
				(myRock.equals("보") && getRock.equals("바위"))){
			System.out.println("윌리엄 : 이겼다!! 오늘 로또 사야지.");
		}else {
			System.out.println("윌리엄 : 졌다.. 난 루저다.");
		}
	}
}