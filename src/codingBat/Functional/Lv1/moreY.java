package CodingBat.Functional.Lv1;

import java.util.List;

public class moreY {
	public List<String> moreY(List<String> strings) {
		
		strings.replaceAll(s -> "y" + s + "y");
		
		return strings;
		
	}
}
