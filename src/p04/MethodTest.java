package p04;
/* 
 * 객체지향인 Java에서는 function을 method라 부름
 * JaveScript는 객체지향 기반 스크립트. function이라 함
 * 
 * 변수의 데이터 타입 : 숫자(정수, 실수), 문자, 논리
 * 메소드의 데이터 타입 : void(리턴 값이 없음, 참조형), 나머지(리턴 값이 있음, 기본형)
*/

class Test{
	public static int getNum() {
		return 0;
	}
}

public class MethodTest {
	public static int getNum() {
		return 0;
	}
	
	public static String getStr() {
		return "";
	}
	
	public static void test() {
		// 리턴하지 않아도 되기 때문에 오류가 없음
		// void는 리턴이 되나 무언가를 리턴할 수 없음. void라는 데이터 타입이 없기 때문
		return ;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = getNum(); // getNum()과 데이터 타입이 같기 때문에 문제되지 않음, 같은 클래스에 있으면 생략되어 있음
		int c = Test.getNum(); // 소속을 지정해줘야 함
		String str = getStr();
	}

}
