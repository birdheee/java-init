package p07;
//왜 굳이 오버로딩 해야함? -> println 메서드도 오버로딩임

public class WhyOverLoading {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println('1');
		System.out.println("1");
		System.out.println(1.1);
		System.out.println(1.1f);
		System.out.println((short)1);
		System.out.println(false);
	}

}
