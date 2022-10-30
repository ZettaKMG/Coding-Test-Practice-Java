package Programmers.Lv0;

public class 숨어있는숫자의덧셈1 {
	class Solution {
		public int solution(String my_string) {
			int result = 0;
			
			for (int i = 0; i < my_string.length(); i++) {
				if (my_string.charAt(i) > 48 && my_string.charAt(i) < 58) {
					result += Integer.parseInt("" + my_string.charAt(i));
				}
			}
			
			return result;
		}
	}
}
