package p02;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 예제 2
		String[] strs = new String[10];
		
		for(int i=0; i<20; i+=2) {
			strs[i/2] = Integer.toString(i+2);
			System.out.println(strs[i/2]);
		}
	}
}