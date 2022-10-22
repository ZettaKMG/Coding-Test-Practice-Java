package Programmers.Lv0;

public class 짝수의합 {
	class Solution {
		public int solution(int n) {
			int even_sum = 0;
			
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					even_sum += i;
				}
			}
			
			return even_sum;
		}
	}
}
