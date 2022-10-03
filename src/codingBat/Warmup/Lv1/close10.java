package codingBat.Warmup.Lv1;

public class close10 {
	public int close10(int a, int b) {
		
		if (Math.abs(10 - a) == Math.abs(10 - b)) {
			return 0;
		} else {
			return Math.abs(10 - b) > Math.abs(10 - a) ? a : b;
		}
		
	}
}
