package Programmers.Lv0;

public class 피자나눠먹기2 {
	class Solution {
		public int solution(int n) {
			int each_pizza = 6; // 피자 한 판은 6조각
			
			// 같은 수로 나눠질 때까지 +6 반복(총 피자 조각 수 구하기)
			while (each_pizza % n != 0) {
				each_pizza += 6;
			}
			
			return each_pizza / 6; // 총 피자 조각 수를 6으로 나누면 판 수
		}
	}
}
