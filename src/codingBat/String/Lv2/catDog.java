package CodingBat.String.Lv2;

public class catDog {
	public boolean catDog(String str) {
		
		int count_cat = 0;
		int count_dog = 0;
		
		for (int i = 0; i < str.length() - 2; i++) {
			
			String sub_cat = str.substring(i, i + 3);
			String sub_dog = str.substring(i, i + 3);
			
			if (sub_cat.equals("cat")) {
				count_cat++;
			} else if (sub_dog.equals("dog")) {
				count_dog++;
			}
			
		}
		
		return count_cat == count_dog;
		
	}
}
