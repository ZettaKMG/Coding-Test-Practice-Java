package Programmers.Lv0;

public class 중복된문자제거 {
	class Solution {
		public String solution(String my_string) {
			String result = "";
			
			for (int i = 0; i < my_string.length(); i++) {
				if (i == my_string.indexOf(my_string.charAt(i))) {
					result += my_string.charAt(i);
				}
			}
			
			return result;
		}
	}
}
