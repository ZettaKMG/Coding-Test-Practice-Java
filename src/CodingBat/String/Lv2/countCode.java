package CodingBat.String.Lv2;

public class countCode {
	public int countCode(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length() - 3; i++) {
			
			String co = "co";
			String e = "e";
			
			if (co.compareTo(str.substring(i, i + 2)) == 0 &&
				e.compareTo(str.substring(i + 3, i + 4)) == 0) {
				count++;
			}
			
		}
		
		return count++;
		
	}
}
