package codingBat.Array.Lv2;

public class countEvens {
	public int countEvens(int[] nums) {
		
		int number_of_even = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				number_of_even++;
			}
		}
		
		return number_of_even;
		
	}
}
