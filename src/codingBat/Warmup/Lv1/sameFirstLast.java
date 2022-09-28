package codingBat.Warmup.Lv1;

public class sameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		
		if (nums.length > 0) {				
			return nums[0] == nums[nums.length - 1];				
		} else {						
			return false;	
			
		}			
	}
}
