package p07;

// Father 클래스는 Father, object라 부를 수 있음
// extends Object가 생략되어 있음
public class Father {
	public String name;
	public int age;
	public String job;
	
	public void printJob() {
		System.out.println(name + "님의 직업은 " + job + "입니다.");
	}
}