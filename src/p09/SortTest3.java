package p09;

public class SortTest3 {
	
	public static void main(String args) {
		int[] nums = new int[] {10, 18, 35, 17, 4};
		int temp = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// 출력
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	}
}
