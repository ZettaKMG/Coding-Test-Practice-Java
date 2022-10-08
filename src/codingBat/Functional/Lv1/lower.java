package codingBat.Functional.Lv1;

import java.util.List;

public class lower {
	public List<String> lower(List<String> strings) {
		
		strings.replaceAll(s -> s.toLowerCase());
		
		return strings;
		
	}
}
