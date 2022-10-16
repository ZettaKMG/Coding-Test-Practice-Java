package CodingBat.Array.Lv2;

public class sum13 {
	public int sum13(int[] nums) {
		
		int total = 0;
		boolean is13 = false;
		boolean was13 = false;
		
		for (int i = 0; i < nums.length; i++) {
			
			is13 = nums[i] == 13;
			
			if (!was13 && !is13) {
				total += nums[i];
			}
			
			was13 = is13;
			
		}
		
		return total;		
		
	}
}
