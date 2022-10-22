package Programmers.Lv0;

public class 문자반복출력하기 {
	class Solution {
		public String solution(String my_string, int n) {
			String answer = "";
			
			for (int i = 0; i < my_string.length(); i++) {
				String re = my_string.substring(i, i + 1);
				
				answer += re.repeat(n);
			}
			
			return answer;
		}
	}
}
