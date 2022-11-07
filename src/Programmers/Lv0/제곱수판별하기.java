package Programmers.Lv0;

public class 제곱수판별하기 {
	class Solution {
		public int solution(int n) {
			for (int i = 1; i < n; i++) {
				if (n == Math.pow(i, 2)) {
					return 1;
				}
			}
			
			return 2;
		}
	}
}
