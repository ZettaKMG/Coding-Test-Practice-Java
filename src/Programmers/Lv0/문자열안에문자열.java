package Programmers.Lv0;

public class 문자열안에문자열 {
	class Solution {
		public int solution(String str1, String str2) {
			if (str1.indexOf(str2) >= 0) {
				return 1;
			} else {
				return 2;
			}
		}
	}
}
