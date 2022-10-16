package CodingBat.Warmup.Lv1;

public class sumDouble {
	public int sumDouble(int a, int b) {
		
//		return a == b ? 2 * (a + b) : a + b;
		
		if (a != b) {
			return a + b;
		} else {
			return 2 * (a + b);
		}
		
	}
}
