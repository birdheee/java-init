package p07;

class Coffee{
	public String name;
	public int price;
	
	// 자식 클래스의 toString 만들기. overriding
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
}

public class Overriding {
	public static void main(String avg[]) {
		Coffee c1 = new Coffee();
		c1.name = "아아";
		c1.price = 2000;
		
		Coffee c2 = c1;
		Coffee c3 = c2;
		
		System.out.println(c1); // jvm에 있는 메모리 주소값. 오브젝트에 있는 toString이 실행되기 때문!
	}
}