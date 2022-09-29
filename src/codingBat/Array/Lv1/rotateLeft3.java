package codingBat.Array.Lv1;

public class rotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		
		return nums;
		
	}
}
