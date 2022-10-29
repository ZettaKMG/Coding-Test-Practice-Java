package Programmers.Lv0;

public class 팩토리얼 {
	class Solution {
		public int solution(int n) {
			int factorial = 1;
			int i = 0;
			
			while (true) {
				if (factorial <= n) {
					factorial *= i + 1;
					i++;
				} else {
					break;
				}
			}
			
			return i - 1;
		}
	}
}
