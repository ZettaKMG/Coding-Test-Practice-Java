package CodingBat.Warmup.Lv1;

public class notString {
	public String notString(String str) {
		
		String FrontWord = "";
		
		if (str.length() >= 3) {
			FrontWord = str.substring(0, 3);
		}
		
		if (FrontWord.equals("not")) {
			return str;
		} else {
			return "not " + str;
		}
		
	}
}
