package Programmers.Lv0;

import java.util.ArrayList;

public class 배열원소의길이 {
	class Solution {
		public ArrayList solution(String[] strlist) {
			ArrayList<Integer> result = new ArrayList<>();
			
			for (String str : strlist) {
				result.add(str.length());
			}
			
			return result;
		}
	}
}
