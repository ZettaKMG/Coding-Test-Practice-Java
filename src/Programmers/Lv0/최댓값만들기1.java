package Programmers.Lv0;

import java.util.Arrays;

public class 최댓값만들기1 {
	class Solution {
		public int solution(int[] numbers) {
			Arrays.sort(numbers);
			
			int max1 = numbers[numbers.length - 1];
			int max2 = numbers[numbers.length - 2];
			
			return max1 * max2;
		}
	}
}
