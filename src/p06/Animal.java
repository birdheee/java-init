package p06;

public class Animal {
	public String name;
	public String type;
	public char trans;
	public String address;
	
	// non-static이기 때문에 name을 사용할 수 있다
	public void eat() {
		System.out.println(name + "가 먹는다");
	}
	
	public void run() {
		System.out.println(name + "가 달린다");
		
	}
	
	public void hunt() {
		System.out.println(name + "가 사냥한다");
	}
	
	public void fly() {
		System.out.println(name + "가 납니다");
	}
}