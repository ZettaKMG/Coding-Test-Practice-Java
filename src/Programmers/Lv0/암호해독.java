package Programmers.Lv0;

public class 암호해독 {
	class Solution {
		public String solution(String cipher, int code) {
			String result = "";
			
			for (int i = 0; i < cipher.length(); i++) {
				if (i % code == (code - 1)) {
					result += cipher.substring(i, i + 1); 
				}
			}
			
			return result;
		}
	}
}
