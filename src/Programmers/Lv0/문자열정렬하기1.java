package Programmers.Lv0;

import java.util.Arrays;

public class 문자열정렬하기1 {
	class Solution {
		public int[] solution(String my_string) {
			my_string = my_string.replaceAll("[a-z]", "");
			int[] result = new int[my_string.length()];
			
			for (int i = 0; i < my_string.length(); i++) {
				result[i] = my_string.charAt(i) - '0';
			}
			
			Arrays.sort(result);
			
			return result;
		}
	}
}
