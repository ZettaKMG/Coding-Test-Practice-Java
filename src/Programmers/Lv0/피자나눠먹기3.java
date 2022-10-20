package Programmers.Lv0;

public class 피자나눠먹기3 {
	class Solution {
		public int solution(int slice, int n) {
			double count = Math.floor(n / slice); // 피자 판 수(몫)
			
			// 사람 수가 조각 수의 배수이면 몫 그대로, 아니면 몫 + 1 반환
			return n % slice == 0 ? (int) count : (int) count + 1;
		}
	}
}
