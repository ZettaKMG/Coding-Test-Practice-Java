package codingBat.Map.Lv1;

import java.util.Map;

public class mapAB3 {
	public Map<String, String> mapAB3(Map<String, String> map) {
		
		boolean has_a = map.containsKey("a");
		boolean has_b = map.containsKey("b");
		
		String a = map.get("a");
		String b = map.get("b");
		
		if (has_a && has_b) {
			return map;
		} else if (has_a) {
			map.put("b", a);
		} else if (has_b) {
			map.put("a", b);
		}
		
		return map;
		
	}
}
