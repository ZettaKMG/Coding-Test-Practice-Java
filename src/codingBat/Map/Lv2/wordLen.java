package codingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : strings) {
			map.put(str, str.length());
		}
		
		return map;
		
	}
}
