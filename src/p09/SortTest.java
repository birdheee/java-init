package p09;

public class SortTest {

	public static void main(String[] args) {
		// 찐 하드코딩
		int n1 = 10;
		int n2 = 18;
		int n3 = 35;
		int n4 = 17;
		int n5 = 4;
		int temp = 0;
		
		if(n1>n2) {
			temp = n1; // 어딘가에 저장
			n1 = n2;
			n2 = temp;
		}
		if(n1>n3) {
			temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if(n1>n4) {
			temp = n1;
			n1 = n4;
			n4 = temp;
		}
		if(n1>n5) {
			temp = n1;
			n1 = n5;
			n5 = temp;
		}
		if(n2>n3) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if(n2>n4) {
			temp = n2;
			n2 = n4;
			n4 = temp;
		}
		if(n2>n5) {
			temp = n2;
			n2 = n5;
			n5 = temp;
		}
		if(n3>n4) {
			temp = n3;
			n3 = n4;
			n4 = temp;
		}
		if(n3>n5) {
			temp = n3;
			n3 = n5;
			n5 = temp;
		}
		if(n4>n5) {
			temp = n4;
			n4 = n5;
			n5 = temp;
		}
		
		// 출력
		System.out.print(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);
	}
}