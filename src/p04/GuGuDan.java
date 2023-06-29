package p04;

public class GuGuDan {
	
	public static void printGuGuDan(int danStart, int danEnd) {
		for(int i=1; i<=danStart; i++) {
			for(int j=1; j<=danEnd; j++) {
				System.out.println(i + " X " + j + " = " + i*j); // 출력이 리턴은 아니다
			}
		}
	}
	
	
	public static void main(String[] args) {
		printGuGuDan(3, 6);
	}
}