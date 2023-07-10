package p11;
// 인터페이스는 실물이 없고, 클래스는 실물이 있음
// 추상 클래스는 프로토타입처럼 인터페이스와 클래스의 중간단계를 지원함

class Son extends AbstractTest{
	@Override
	public void test2() {
	}
	
}

public abstract class AbstractTest {
	public void test() {
		
	}
	public abstract void test2(); // 메모리 생성은 할 수 없음
	
	public static void main(String args[]) {
		// AbstractTest at = new test2(); 안됨
		AbstractTest at = new Son();
	}
}