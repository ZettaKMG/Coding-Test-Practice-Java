package codingBat.Map.Lv2;

import java.util.HashMap;
import java.util.Map;

public class word0 {
	public Map<String, Integer> word0(String[] strings) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : strings) {
			map.put(str, 0);
		}
		
		return map;
		
	}
}
