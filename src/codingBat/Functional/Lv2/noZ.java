package codingBat.Functional.Lv2;

import java.util.List;

public class noZ {
	public List<String> noZ(List<String> strings) {
		
		strings.removeIf(s -> s.contains("z"));
		
		return strings;
		
	}
}
