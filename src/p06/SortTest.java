package p06;
// 선택정렬
public class SortTest {

	public static void main(String[] args) {
		int[] nums = new int[] {10, 7, 15, 1, 4};
		for(int i=0; i<nums.length; i++) {
			int min = nums[i];
			int idx = i;
			for(int j=i+1; j<nums.length; j++) {
				if(min > nums[j]) {
					min = nums[j];
					idx = j;
				}
			}
			int temp = nums[i];
			nums[i] = min;
			nums[idx] = temp;
		}
		
		// 출력
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	}

}