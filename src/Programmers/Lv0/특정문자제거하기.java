package Programmers.Lv0;

public class 특정문자제거하기 {
	class Solution {
		public String solution(String my_string, String letter) {
			String answer = my_string.replaceAll(letter, "");
			
			return answer;	
		}
	}
}
