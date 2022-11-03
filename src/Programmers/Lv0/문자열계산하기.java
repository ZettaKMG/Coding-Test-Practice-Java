package Programmers.Lv0;

public class 문자열계산하기 {
	class Solution {
		public int solution(String my_string) {
			String[] str_array = my_string.split(" ");
			int result = Integer.parseInt(str_array[0]);
			
			for (int i = 1; i < str_array.length; i+=2) {
				if (str_array[i].equals('+')) {
					result += Integer.parseInt(str_array[i + 1]);
				} else if (str_array[i].equals("-")) {
					result += Integer.parseInt(str_array[i + 1]);
				}
			}
			
			return result;
		}
	}
}
