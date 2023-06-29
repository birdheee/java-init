package p03;

public class TwoArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		System.out.println("numsArray 길이 : " + numsArray.length);
		
		// 첫번째 방법
		int cnt = 1;
		for(int i=0; i<numsArray.length; i++) {
			for(int j=0; j<numsArray[0].length; j++) {
				numsArray[i][j] = cnt;
				cnt++;
			}
		}
		
		// 두번째 방법
		for(int i=0; i<numsArray.length; i++) {
			for(int j=0; j<numsArray[0].length; j++) {
				numsArray[i][j] = (numsArray.length*i+j)+1;
			}
		}
		
		for(int i=0; i<numsArray.length; i++) {
			for(int j=0; j<numsArray[0].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}
}
