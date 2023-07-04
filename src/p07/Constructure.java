package p07;

import java.util.Scanner;

public class Constructure {
	// 데이터 타입도 없고 클래스와 이름이 같음 -> 생성자라고 함
	// 생성자 : 생성할 때 호출됨. 기본적으로 생기기 때문에 기본 생성자라고도 함
	// 생성자는 데이터 타입이 없다. 메서드처럼 호출하는 것이 아니라 new로 호출한다. 오버로딩이 가능하다.
	
	public Constructure(){
		System.out.println("Constructure() 호출");
	}
	
	public Constructure(int num) {
		System.out.println("Constructure(int num) 호출");
	}
	
	public static void main(String avgs[]) {
		Constructure c = new Constructure();
		Scanner scan = new Scanner(System.in); // 스캐너는 기본 생성자가 없음 
	}
}