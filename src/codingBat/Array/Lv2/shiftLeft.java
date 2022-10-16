package CodingBat.Array.Lv2;

public class shiftLeft {
	public int[] shiftLeft(int[] nums) {
		
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[(i + 1) % nums.length];
		}
		
		return result;
		
	}
}
