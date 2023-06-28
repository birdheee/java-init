package p03;
// array는 방 개수 수정이 안됨, 자료형이 같아야 함
// temp를 활용해서 방 개수 수정하는 방법

public class ArrayTest {

	public static void main(String[] args) {
		int[] ages = new int[]{1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
		int[] tmp = ages; // tmp에 임시 저장, tmp에는 0-9번 방까지 있음
		ages = new int[20];
		
		
		// 더 작은 것을 기준으로 돌려야 함. 아니면 out of range 오류가 남
		for(int i=0; i<ages.length; i++) {
			if(i>=tmp.length) {
				ages[i] = 0;
			}else {
				ages[i] = tmp[i]; // age에 tmp를 넣기
			}
		}
		
		for(int i=0; i<ages.length; i++) {
			System.out.println("ages[" + i + "] = " + ages[i]);
		}
	}
}