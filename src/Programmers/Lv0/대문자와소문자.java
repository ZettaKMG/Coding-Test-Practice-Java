package Programmers.Lv0;

public class 대문자와소문자 {
	class Solution {
		public String solution(String my_string) {
			String result = "";
			
			for (int i = 0; i < my_string.length(); i++) {
				char c = my_string.charAt(i);
				
				if (Character.isLowerCase(c)) {
					result += String.valueOf(c).toUpperCase();
				} else {
					result += String.valueOf(c).toLowerCase();
				}
			}
			
			return result;
		}
	}
}
