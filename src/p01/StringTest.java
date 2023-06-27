package p01;
// String 보충

public class StringTest {

	public static void main(String[] args) {
		String str = "123456789";
		char c = str.charAt(5);
		System.out.println(c);
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2); // 메모리 주소가 같다
		String s3 = new String("1"); // 새로운 메모리를 만든다
		System.out.println(s1 == s3); // 메모리 주소가 다르다
		String s4 = new String("1"); // 새로운 메모리를 만든다
		System.out.println(s1 == s3); // 메모리 주소가 다르다
		System.out.println(s1.equals(s4)); // 값을 비교한다
		
		// 문자열 찾기 (-1을 리턴)
		int idx = str.indexOf("3");
		System.out.println(idx);
		int idx2 = str.indexOf("6");
		System.out.println(idx2);
		
		// 슬라이싱
		String subStr = str.substring(1, 5);
		System.out.println(subStr);
		
		// 문자열 대치
		String newStr = str.replace("1", "one");
		System.out.println(newStr);
		
		// 대소문자
		String name = "William";
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
	}

}

// String은 ==을 쓸 일이 없다. 메모리 주소를 비교하는 짓이다. 진짜 그 value를 비교하려면 equals를 사용한다.
