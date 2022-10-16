package CodingBat.Array.Lv2;

public class centeredAverage {
	public int centerAverage(int[] nums) {
		
		int total = 0;
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];				
			}
			
			if (min > nums[i]) {
				min = nums[i];
			}
			
			total += nums[i];
		}
		
		return (total - max - min) / (nums.length - 2);
		
	}
}
