package codingBat.Warmup.Lv1;

public class parrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		
//		return talking && (hour < 7 || hour > 20);
		
		if (talking && (hour < 7 || hour > 20)) {
			return true;
		} else {
			return false;
		}
		
	}
}
