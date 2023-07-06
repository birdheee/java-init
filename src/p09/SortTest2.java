package p09;

public class SortTest2 {

	public static void main(String[] args) {
		// 배열로 저장해서 하드코딩
		int[] nums = new int[] {10, 18, 35, 17, 4};
		int temp = 0;
		
		if(nums[0]>nums[1]) {
			temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}
		if(nums[0]>nums[2]) {
			temp = nums[0];
			nums[0] = nums[2];
			nums[2] = temp;
		}
		if(nums[0]>nums[3]) {
			temp = nums[0];
			nums[0] = nums[3];
			nums[3] = temp;
		}
		if(nums[0]>nums[4]) {
			temp = nums[0];
			nums[0] = nums[4];
			nums[4] = temp;
		}
		if(nums[1]>nums[2]) {
			temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;
		}
		if(nums[1]>nums[3]) {
			temp = nums[1];
			nums[1] = nums[3];
			nums[3] = temp;
		}
		if(nums[1]>nums[4]) {
			temp = nums[1];
			nums[1] = nums[4];
			nums[4] = temp;
		}
		if(nums[2]>nums[3]) {
			temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;
		}
		if(nums[2]>nums[4]) {
			temp = nums[2];
			nums[2] = nums[4];
			nums[4] = temp;
		}
		if(nums[3]>nums[4]) {
			temp = nums[3];
			nums[3] = nums[4];
			nums[4] = temp;
		}
		
		// 출력
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	}

}
