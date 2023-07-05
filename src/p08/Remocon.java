package p08;

// 표준대로 구현(implement) - 반드시 on, off를 구현해야 함
// Remocon 클래스를 Remocon, Remote, Object 세가지 이름으로 부를 수 있다.
public class Remocon implements Remote {
	
	@Override // 상위에 있는 것 오버라이딩 했다는 뜻
	public void on() {
		System.out.println("켭니다.");
	}

	@Override
	public void off() {
		System.out.println("끕니다");
	}
	
}