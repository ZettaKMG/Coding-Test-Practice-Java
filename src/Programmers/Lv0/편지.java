package Programmers.Lv0;

public class 편지 {
	class Solution {
		public int solution(String message) {
			int count = 0;
			
			for (int i = 0; i < message.length(); i++) {
				count++;
			}
			
			return count * 2;
		}
	}
}
