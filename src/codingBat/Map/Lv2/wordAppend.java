package codingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
	public String wordAppend(String[] strings) {
		
		String result = "";
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : strings) {
			String key = str;
			
			if (map.containsKey(key)) {
				Integer prev = map.get(key);
				map.put(key, prev + 1);
			} else {
				map.put(key, 1);
			}
			
			Integer cur = map.get(key);
			
			if (cur % 2 == 0) {
				result += key;
			}
		}
		
		return result;
		
	}
}
