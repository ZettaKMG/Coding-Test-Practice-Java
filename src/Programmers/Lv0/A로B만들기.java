package Programmers.Lv0;

import java.util.Arrays;

public class A로B만들기 {
	class Solution {
	    public int solution(String before, String after) {
	        char[] a = before.toCharArray(); // before를 문자 한 개씩 쪼갠 배열
	        char[] b = after.toCharArray(); // after를 문자 한 개씩 쪼갠 배열
	        
	        Arrays.sort(a); // a 배열을 알파벳 오름차순으로 정렬
	        Arrays.sort(b); // b 배열을 알파벳 오름차순으로 정렬

	        return new String(a).equals(new String(b)) ? 1 : 0; // 결과 반환(정렬된 두 배열이 동일하면 1, 다르면 0 반환)
	    }
	}
}
