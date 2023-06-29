package p04;

import java.util.Random;

public class MethodTest2 {
	
	public static int getRandomNum(int max){
		Random random = new Random();
		int rNum = random.nextInt(max);
		rNum += 1; // int니까 가능
		return rNum;
	}

	public static void main(String[] args) {
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
	}

}
