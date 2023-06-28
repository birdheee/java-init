package p03;
// Integer로
//1부터 100까지
// 3이 들어가면 짝
// 5의 배수이면 만세

public class ThreeSixNine {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int num1 = i%10; // 1의 자리 수
			int num10 = i/10; // 10의 자리 수
			if(i%5 == 0) {
				System.out.println("만세!");
			}else if(num1%3 == 0 || num10 == 3 || num1%6 == 0 || num10 == 6 || num1%9 == 0 || num10 == 9){
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}
}