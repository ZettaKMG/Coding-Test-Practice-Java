package codingBat.Array.Lv2;

public class lucky13 {
	public boolean lucky13(int[] nums) {
		
		int i = 0;
		
		while (i < nums.length) {
			
			if (nums[i] == 1 || nums[i] == 3) {
				return false;
			}
			
			i++;
			
		}
		
		return true;
		
	}
}
