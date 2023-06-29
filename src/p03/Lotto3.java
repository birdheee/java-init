package p03;
// 여기서 최소 세문제

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		// 랜덤생성
		Random ra = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {
			int rNum = ra.nextInt(45) + 1;
			lotto[i] = rNum;
		}
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("1부터 45까지의 숫자 6개를 입력 : ");
		String lottoStr = scan.nextLine();
		String[] strs = lottoStr.split(",");
		
		// 비교
		int count = 0;
		for(int i=0; i<lotto.length; i++) {
			int lottoNum = Integer.parseInt(strs[i]); // int로 형변환
			if(lotto[i] == lottoNum) {
				count++;
			}
		}
		System.out.print("맞힌 개수 : " + count + "개");
	}
}