package codingBat.Logic.Lv1;

public class alarmClock {
	public String alarmClock (int day, boolean vacation) {
		
		String early;
		String late;
		
		if (vacation) {
			early = "10:00";
			late = "off";
		} else {
			early = "7:00";
			late = "10:00";
		}
		
		String result = "";
		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				result = early;
				break;
			
			case 0:
			case 6:
				result = late;
		}
		
		return result;
		
	}
}
