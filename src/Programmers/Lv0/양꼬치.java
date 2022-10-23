package Programmers.Lv0;

public class 양꼬치 {
	class Solution {
		public int solution(int n, int k) {
			
			if (n >= 10) {
				k -= Math.floor(n / 10);				
			}
			
			return 12000 * n + 2000 * k;			
		}
	}
}
