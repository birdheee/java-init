package p03;
// String으로
//1부터 100까지
//3이 들어가면 짝
//5의 배수이면 만세

public class TreeSixNine2 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			String numStr = Integer.toString(i);
			// 5의 배수인지 먼저 확인
			if(i%5 == 0) {
				System.out.println("만세!");
			}else if(numStr.contains("3") || numStr.contains("6") || numStr.contains("9")) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}
}