package p02;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 예제 3
		String[] strs = new String[10];
		
		for(int i=0; i<=9; i++) {
			strs[i] = Integer.toString(10-i);
			System.out.println(strs[i]);
		}
	}
}
