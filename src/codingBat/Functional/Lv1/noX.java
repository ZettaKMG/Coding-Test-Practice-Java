package codingBat.Functional.Lv1;

import java.util.List;

public class noX {
	public List<String> noX(List<String> strings) {
		
		strings.replaceAll(s -> s.replace("x", ""));
		
		return strings;
		
	}
}
