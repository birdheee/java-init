package p07;

public class FinalTest {
	
	// 이곳에서는 선언만 가능함
	// 규칙 : 여기서 final을 선언할 경우 무조건 대문자
	final int NUM = 1;
	final int NUM_TEST = 2; // 두 단어를 합치는 경우, 가독성을 위해 _를 사용
	
	public static void main(String avg[]) {
		// 절대로 바꿀 수 없는 상수
		final int num = 1;
//		num = 2; 오류
	}
}