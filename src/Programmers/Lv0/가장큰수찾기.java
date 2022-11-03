package Programmers.Lv0;

public class 가장큰수찾기 {
	class Solution {
		public int[] solution(int[] array) {
			int max = 0;
			int index = 0;
			
			for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
					index = i;
				}
			}
			
			int[] result = {max, index};
			
			return result;
		}
	}
}
