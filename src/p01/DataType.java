package p01;
// 원시형

public class DataType {

	public static void main(String[] args) {
		char c = '1';
		byte b = 1;
		int i = 1; // i가 더 크기 때문에 b를 i에 넣을 수 있다
//		short s = 1; // s가 더 작기 때문에 i에 넣을 수 없다
		short s = (short)i;
		
		int i2 = 1000000000; // 10억까지 int에 넣을 수 있다.
		long l2 = 10000000000l; // 뒤에 l를 써서 long이라고 명시한다
		
		double dou = 1.1;
		float fl = 1.1f; // 뒤에 f를 써서 long이라고 명시한다
		
		boolean bool = true;
	}
}