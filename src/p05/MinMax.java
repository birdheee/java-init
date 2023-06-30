package p05;

public class MinMax {

	public static void main(String[] args) {
		int[] nums = new int[]{10, 22, 5, 8, 25};
		
		int min = nums[0];
		int max = nums[0];
		int minIdx = 0;
		int maxIdx = 0;
		
		for(int i=1; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				maxIdx = i;
			}
			if(min>nums[i]) {
				min = nums[i];
				minIdx = i;
			}
		}
		System.out.println("최댓값 : " + max + ", 인덱스 : " + maxIdx);
		System.out.println("최솟값 : " + min + ", 인덱스 : " + minIdx);
	}
}