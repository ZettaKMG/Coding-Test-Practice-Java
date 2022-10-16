package CodingBat.Array.Lv2;

public class has22 {
	public boolean has22(int[] nums) {
		
		int i = 0;
		
		while (i < nums.length - 1) {
			
			if (nums[i] == 2) {
				if (nums[i + 1] == 2) {
					return true;
				}
			}
			
			i++;
		}
		
		return false;
		
	}
}
