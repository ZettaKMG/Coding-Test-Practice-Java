package codingBat.Map.Lv1;

import java.util.Map;

public class mapAB4 {
	public Map<String, String> mapAB4(Map<String, String> map) {
		
		boolean has_a = map.containsKey("a");
		boolean has_b = map.containsKey("b");
		
		if (has_a && has_b) {
			String a = map.get("a");
			String b = map.get("b");
			
			int len_a = a.length();
			int len_b = b.length();
			
			if (len_a == len_b) {
				map.put("a", "");
				map.put("b", "");
			} else if (len_a > len_b) {
				map.put("c", a);
			} else {
				map.put("c", b);
			}			
		}
		
		return map;
		
	}
}
