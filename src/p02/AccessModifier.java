package p02;

public class AccessModifier {
	int b = 10; // 이 곳은 선언과 초기화 밖에 안된다
//	System.out.println(b); // 실행이 안됨
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
//		System.out.println(b); // 안됨. 여기서 실행하려면 b가 있는 위치를 알려줘야 한다
		AccessModifier am1 = new AccessModifier(); // 선언과 초기화, 참조형과 변수 = 초기화, 이제 am은 b에 접근할 수 있다.
		System.out.println(am1.b);
		am1.b = 5; // 만일 am.b를 5로 바꿔도
		AccessModifier am2 = new AccessModifier(); //am2로 선언하면 
		System.out.println(am2.b); // 10이 나온다
	}
}