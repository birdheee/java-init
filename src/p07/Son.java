package p07;

// Son 클래스는 Son, Father, object라 부를 수 있음
public class Son extends Father {
	public String hobby;
	
	public void printHobby() {
		System.out.println(name + "님의 취미는 " + hobby + "입니다.");
	}
}