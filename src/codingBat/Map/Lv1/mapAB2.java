package codingBat.Map.Lv1;

import java.util.Map;

public class mapAB2 {
	public Map<String, String> mapAB2(Map<String, String> map) {
		
		String a = map.get("a");
		String b = map.get("b");
		
		if (a != null && a.equals(b)) {
			map.remove("a");
			map.remove("b");
		}
		
		return map;
		
	}
}
