package CodingBat.Array.Lv2;

public class bigDiff {
	public int bigDiff(int[] nums) {
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			
			if (max < nums[i]) {
				max = nums[i];
			}
			
		}
		
		for (int j = 0; j < nums.length; j++) {
			
			if (min > nums[j]) {
				min = nums[j];
			}
			
		}
		
		return max - min;
			
		
	}
}
