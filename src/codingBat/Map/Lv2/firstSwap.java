package CodingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class firstSwap {
	public String[] firstSwap(String[] strings) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i =0; i < strings.length; i++) {
			
			String str = strings[i];
			Character key = str.charAt(0);
								
			if (map.containsKey(key)) {
				Integer prev_index = map.get(key);
				
				if (prev_index != -1) {
					String temp = strings[prev_index];
					strings[prev_index] = strings[i];
					strings[i] = temp;
					
					map.put(key, -1);
				}				
			} else {
				map.put(key, i);
			}
		}
		
		return strings;
		
	}
}
