package p08;

// TVRemocon, Remocon, Remote, Object
public class TVRemocon extends Remocon {
	// 생성자는 데이터 타입이 없고 클래스와 이름이 같음
	public void on() {
		System.out.println("TV를 켭니다");
	}
	
	public void off() {
		System.out.println("TV를 끕니다");
	}
	
	public void chUp() {
		System.out.println("채널을 올립니다.");
	}
	
	public void chDown() {
		System.out.println("채널을 내립니다.");
	}
}