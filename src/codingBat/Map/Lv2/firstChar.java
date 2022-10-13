package codingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
	public Map<String, String> firstChar(String[] strings) {
		
		Map<String, String> map = new HashMap<>();
		
		for (String str : strings) {
			String key = str.substring(0, 1);
			
			if (map.containsKey(key)) {
				String prev = map.get(key);
				map.put(key, prev + str);
			} else {
				map.put(key, str);
			}
		}
		
		return map;
		
	}
}
