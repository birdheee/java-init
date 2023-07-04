package p07;
// public은 패키지, 클래스 상관없이 누구나 접근 가능한 것
// protected는 같은 패키지에서만. 그러나 다른패키지라도 상속받을 때는 가능
// default는 같은 패키지에서만. 아무 것도 안 쓰면 default임
// private은 나만 되는 것. 상속도 안됨

// overloading : 같은 영역에 같은 메소드로 선언하고 싶을 때 사용. 자바는 메소드의 파라미터까지 확인함
// overloading의 기준: 
// 1. 같은 영역이어야 함
// 2. 메소드 명이 같아야 함
// 3. 파라미터 개수가 달라야 함
// 4. 파라미터 개수가 같더라도 데이터 타입이 달라야 함
// 5. 파라미터 개수와 데이터 타입이 같더라도 순서가 달라야 함

public class OverLoading {
	public void test() {
		System.out.println("test() 호출");
	}
	
	public void test(byte num) {
		System.out.println("test(byte num) 호출");
	}
	
	public void test(short num) {
		System.out.println("test(short num) 호출");
	}
	
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	
	public void test(long num) {
		System.out.println("test(long num) 호출");
	}
	
	public void test(float fl) {
		System.out.println("test(float fl) 호출");
	}
	
	public void test(double db) {
		System.out.println("test(doubld db) 호출");
	}
	
	public void test(char c) {
		System.out.println("test(char c) 호출");
	}
	
	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	
	public void test(boolean bool) {
		System.out.println("test(boolean bool) 호출");
	}
	
	public static void main(String avgs[]) {
		OverLoading test = new OverLoading();
		test.test();
		test.test(2);
		test.test("123");
		test.test(2.2);
		test.test((short)2);
		test.test(10000000000l);
		test.test('A');
		test.test(true);
	}
}
