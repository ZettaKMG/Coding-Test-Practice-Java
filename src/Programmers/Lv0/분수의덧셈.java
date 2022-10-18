package Programmers.Lv0;

public class 분수의덧셈 {
	class Solution {
		public int[] solution(int denum1, int num1, int denum2, int num2) {
			
			int up_num = denum1 * num2 + num1 * denum2; // 분자
			int down_num = num1 * num2; // 분모
			int minimum = 1; // 최소 공배수
			
			// 약분
			for (int i = 1; i <= up_num; i++) {
				if (up_num % i == 0 && down_num % i == 0) {
					minimum = i;
				}
			}
			
			int[] answer = {up_num / minimum, down_num / minimum};
			
			return answer;
			
		}
	}
}
