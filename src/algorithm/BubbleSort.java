package algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<(nums.length-1)-i; j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}