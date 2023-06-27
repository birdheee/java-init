package p01;
// for 문은 시작과 종료가 명확할 때 쓰는 것이 효과적
// 순서대로 선언부, 조건부, 증감부
// 모두 채워야지만 동작하는 것은 아니다.

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println("안녕");
		}
		
		// 짝수만 출력(방법 1)
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		// 짝수만 출력(방법 2)
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
	}
}