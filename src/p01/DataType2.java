package p01;
import java.util.Scanner; // 임포트해야 함
// 참조형

public class DataType2 {
	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str.length());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,3));
		System.out.println(str.indexOf("3"));
		int idx = str.indexOf("3");
		System.out.println("3의 index : " + idx);
		idx = str.indexOf("5");
		System.out.println("5의 index : " + idx); // 절대 나올 수 없는 인덱스 중 가장 큰 값
		
		Scanner scan = new Scanner(System.in); // ctrl + shift + O 자동 임포트
	}
}