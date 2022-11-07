package Programmers.Lv0;

import java.util.Arrays;

public class 문자열정렬하기2 {
	class Solution {
		public String solution(String my_string) {
			char[] str_char = my_string.toLowerCase().toCharArray();
			
			Arrays.sort(str_char);
			
			String result = new String(str_char);
			
			return result;
		}
	}
}
