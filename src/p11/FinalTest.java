package p11;
/* final은 변수, 메서드, 클래스에 붙을 수 있음 
 * 변수 - 상수
 * 메서드 - 오버라이딩 안됨
 * 클래스 - 상속 안됨
 * */ 

class Test{
	// 메서드에 final이 붙을 경우 오버라이딩이 안됨
	public final void test() {
		System.out.println("난 test!");
	}
}

public class FinalTest extends Test {
	// 오류
//	public void test() {
//		System.out.println("난 final test!");
//	}
}