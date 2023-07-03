package p06;

public class NullTest {
	String str1 = "123";
	String str2;

	public static void main(String[] args) {
		NullTest nt = new NullTest(); // null로 넣어줌
		System.out.println(nt.str2); // null
		System.out.println(nt.str2.length()); // NullPointerException
	}

}
