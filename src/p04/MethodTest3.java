package p04;

public class MethodTest3 {
	/* 이곳은 멤버 필드
	 * 메서드 선언은 클래스 안에서만 가능
	 */
	public static void test() {
		
	}
	public static int getNum() {
		return 1;
	}
	
	public static void main(String[] args) {
//		int i = test(); // 데이터 타입이 달라 오류
//		String str = test(); // 이것도
		
		int num = getNum();
		System.out.println(num);
	}
}