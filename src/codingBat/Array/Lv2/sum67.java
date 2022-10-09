package codingBat.Array.Lv2;

public class sum67 {
	public int sum67(int[] nums) {
		
		int total = 0;
		
		int i = 0;
		
		while (i < nums.length) {
			
			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				total += nums[i];
			}
			
			i++;
			
		}
				
		return total;
		
	}
}
