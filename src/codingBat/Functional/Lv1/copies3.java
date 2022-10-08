package codingBat.Functional.Lv1;

public class copies3 {
	public List<String> copies3(List<String> strings) {
		
		strings.replaceAll(s -> s + s + s);
		
		return strings;
		
	}	
}
