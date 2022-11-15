package Programmers.Lv0;

public class 중복된숫자개수 {
	class Solution {
	    public int solution(int[] array, int n) {
	        int count = 0; // n의 개수
	        
	        // 배열의 각 숫자가 n과 일치할 때마다 count 더하기
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == n) {
	                count++;
	            }
	        }
	        
	        return count; // 결과 반환
	    }
	}
}
