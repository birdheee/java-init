package p06;

class Car{
	public String name;
	public static String type;
}

public class InstanceTest {
	
	public static void main(String args[]) {
//		Car.name = "소나타"; non-static은 반드시 메모리를 생성해야 함. 그럼 왜 있을까? 메모리(용량) 때문
		Car.type = "승용차";
		Car sonata = new Car(); // 메모리 생성. 참조형은 초기화할 때 반드시 new를 붙임
		System.out.println(sonata.name); // null
		sonata.name = "소나타";
		System.out.println(sonata.name); // 소나타
	}
}