package Programmers.Lv0;

public class 피자나눠먹기1 {
	class Solution {
		public int solution(int n) {
			double count = Math.floor(n / 7); // 피자 판 수(몫)
			
			// 사람 수가 7의 배수이면 몫을, 아니면 몫 + 1 반환
			return n % 7== 0 ? (int) count : (int) count + 1;
		}
	}
}
