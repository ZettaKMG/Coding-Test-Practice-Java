package CodingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
	public Map<String, Integer> wordCount(String[] strings) {
	
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : strings) {
			
			if (map.containsKey(str)) {
				int value = map.get(str);
				map.put(str, value + 1);
			} else {
				map.put(str, 1);
			}
			
		}
		
		return map;
		
	}	
}
