package Programmers.Lv0;

public class 순서쌍의개수 {
	class Solution {
		public int solution(int n) {
			int count = 0;
			
			for (int i = 1; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					count += 2;
				}
			}
			
			if (n % Math.sqrt(n) == 0) {
				count++;
			}
			
			return count;
		}
	}
}
