package CodingBat.String.Lv2;

public class endOther {
	public boolean endOther(String a, String b) {
				
		String a_low = a.toLowerCase();
		String b_low = b.toLowerCase();
		
		if (a_low.endsWith(b_low) || b_low.endsWith(a_low)) {
			return true;
		}
		
		return false;
		
	}
}
