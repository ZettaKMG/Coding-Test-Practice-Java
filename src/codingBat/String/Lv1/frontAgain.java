package codingBat.String.Lv1;

public class frontAgain {
	public boolean frontAgain(String str) {
		
		if (str.length() < 2) {
			return false;
		}
		
		String end = str.substring(str.length() - 2);
		int i = str.indexOf(end);
		
		return i == 0;
		
	}
}
