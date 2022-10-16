package CodingBat.Warmup.Lv1;

public class monkeyTrouble {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		
//		return (aSmile && bSmile) || (!aSmile && !bSmile);
		
		if (aSmile && bSmile) {
			return true;
		} else if (!aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}
		
	}
}
