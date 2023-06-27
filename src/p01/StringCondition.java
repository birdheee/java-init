package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1은 123");
		}else{
			System.out.println("s1은 123이 아님");
		}
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.println("s2은 123");
		}else{
			System.out.println("s2은 123이 아님");
		}
		
		
		String s3 = "";
		System.out.println(s3.equals(" ")); // false
		
		// trim은 공백을 지움
		String s4 = "	123";
		System.out.println(s4.trim().equals("123")); // true
		
		String s5 = new String("1");
		System.out.println("1".equals(s5)); // true, 이 방법을 추천함
		System.out.println(s5.equals("1")); // true
	}

}
