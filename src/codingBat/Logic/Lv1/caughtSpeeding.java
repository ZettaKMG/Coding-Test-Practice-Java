package CodingBat.Logic.Lv1;

public class caughtSpeeding {
	public int caughtSpeeding(int speed, boolean isBirthday) {
		
		int limit1 = 61;
		int limit2 = 81;
		
		if (isBirthday) {
			limit1 += 5;
			limit2 += 5;
		}
		
		if (speed >= limit2) {
			return 2;
		} else if (speed >= limit1 && speed < limit2) {
			return 1;
		} else {
			return 0;
		}
		
	}
}
