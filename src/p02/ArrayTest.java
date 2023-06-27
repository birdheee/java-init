package p02;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strs1; // 변수의 선언
		String[] strs2 = new String[2]; // 변수의 선언과 초기화, null로 초기화됨
		
		System.out.println(strs2[0]); // null
		System.out.println(strs2[1]); // null
		
		strs2[0] = "일";
		System.out.println(strs2[0]); // 일
		
		System.out.println(strs2[0].length());
		System.out.println(strs2[1].length()); // NullPointerException, 하나가 null이 아니라 해서 다른 방이 null이 아니지는 않음
		
		String str1 = "1";
		String str2 = "2";
		
		// 예제 1
		String[] strNums = new String[10];
		// 0 -> 1
		// 1 -> 2
		// 2 -> 3
		// 9 -> 10
		
		for(int i=0; i<=9; i++) {
			strNums[i] = Integer.toString(i+1);
			System.out.println(strNums[i]);
		}
	}
}