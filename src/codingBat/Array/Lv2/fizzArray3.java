package CodingBat.Array.Lv2;

public class fizzArray3 {
	public int[] fizzArray3(int start, int end) {
		
		int[] result = new int[end - start];
		
		for (int i = start; i < end; i++) {
			result[i - start] = i;
		}
		
		return result;
		
	}
}
