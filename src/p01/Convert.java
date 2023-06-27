package p01;
// equals는 문자열 비교

public class Convert {

	public static void main(String[] args) {
		int i = 1;
		String s = "1";
		
		// Integer를 String으로 변환
		String s1 = i + "";
		System.out.println(s.equals(s1)); // true
		
		// String을 Integer로 변환
		int i1 = Integer.parseInt(s); 
		System.out.println(i1 == i); // true
		
		// 에러. one은 Integer로 변환할 수 없음
		String s2 = "one";
//		int i2 = Integer.parseInt(s2);
//		System.out.println(i2);
	}
}