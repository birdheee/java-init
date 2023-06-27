package p02;

public class ForLoop {

	public static void main(String[] args) {
		// 예제 1
		for(int i=1; i<10; i++) {
			System.out.println("1 X " + i + " = "+ (1*i));
		}
		
		System.out.println("-----------------------------");
		
		// 예제 2
		for(int i=1; i<10; i++) {
			System.out.println(i + " X 1 = " + (i*1));
		}
		
		System.out.println("-----------------------------");
		
		// 예제 3
		for(int i=9; i>0; i--) {
			System.out.println(i + " X 1 = " + (i*1));
		}
	}
}