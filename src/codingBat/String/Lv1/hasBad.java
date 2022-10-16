package CodingBat.String.Lv1;

public class hasBad {
	public boolean hasBad(String str) {
	
		if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1) {
			return true;
		} else {
			return false;
		}
		
	}	
}
