package Programmers.Lv0;

import java.util.ArrayList;

public class 컨트롤제트 {
	class Solution {
		public int solution(String s) {
			int result = 0;
			String[] str = s.split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals("Z")) {
					if (numbers.size() != 0) {
						numbers.remove(numbers.size() - 1);
					}
				} else {
					numbers.add(Integer.parseInt(str[i]));
				}
			}
			
			for (int number : numbers) {
				result += number;
			}
			
			return result;
		}
	}
}
