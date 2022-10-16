package CodingBat.String.Lv1;

public class seeColor {
	public String seeColor(String str) {
		
		if (str.indexOf("red") == 0) {
			return "red";
		} else if (str.indexOf("blue") == 0) {
			return "blue";
		} else {
			return "";
		}
		
	}
}
