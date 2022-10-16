package CodingBat.String.Lv1;

public class middleThree {
	public String middleThree(String str) {
		
		int n = str.length() - 1;
		
		return str.substring(n / 2 - 1, n / 2 + 2);
		
	}
}
