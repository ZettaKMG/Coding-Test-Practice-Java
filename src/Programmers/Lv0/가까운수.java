package Programmers.Lv0;

import java.util.Arrays;

public class 가까운수 {
	class Solution {
		public int solution(int[] array, int n) {
			int result = 0;
			Arrays.sort(array);
			
			for (int i = 0; i < array.length; i++) {
				if (Math.abs(array[0] - n) > Math.abs(array[i] - n)) {
					array[0] = array[i];
				}
				
				result = array[0];
			}
			
			return result;
		}
	}
}
