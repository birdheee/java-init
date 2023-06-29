package p04;
//변수란 : 다양한 값을 저장하기 위해서 사용함. 고정된 값으로 저장하기 위해서였다면 상수

public class MethodTest4 {
	
	// 로또를 생성하는 메소드
	public static int[] getLotto(int size, int max) {
		int[] lotto = new int[size];
		for(int i=0; i<lotto.length; i++) {
			int rNum = MethodTest2.getRandomNum(max);
			// 중복 제거
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
					break;
				}
			}
			if(lotto[i]==0) {
				lotto[i] = rNum;
			}
		}
		return lotto;
	}
	
	// 로또를 출력하는 메소드
	public static void printLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}

	public static void main(String[] args) {
		int[] lotto = getLotto(6, 45);
		printLotto(lotto);
	}
}
