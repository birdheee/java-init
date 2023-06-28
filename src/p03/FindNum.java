package p03;
// for문은 시작과 끝이 명확할 때, while문은 이벤트에 의해 중단할 때 합리적임
// do while문은 조건이 성립하지 않더라도 일단 실행하고 봄 

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean correct = false; // 초기화
		Random random = new Random();
		int rNum = random.nextInt(10) + 1; // 1부터 10까지
		int count = 0;
		
		while(!correct) {
			System.out.print("1부터 10까지 숫자를 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine()); // nextLine은 무언가를 쓰고 엔터치는 것, 문자로 입력받음
			correct = rNum == inputNum; // 여기서 논리연산을 수행
//			System.out.println("다시하세요.");
			count++;
		}
		System.out.println("아 맞췄다!" + count + "번 만에 맞춤");
	}
}