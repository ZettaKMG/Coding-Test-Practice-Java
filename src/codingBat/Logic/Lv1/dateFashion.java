package codingBat.Logic.Lv1;

public class dateFashion {
	public int dateFashion(int you, int date) {
		
		int result = 1;
		
		if (you >= 8 || date >= 8) {
			result = 2;
		}
		
		if (you <= 2 || date <=2 ) {
			result = 0;
		}
		
		return result;
		
	}
}
