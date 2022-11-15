package Programmers.Lv0;

public class 머쓱이보다키큰사람 {
	class Solution {
	    public int solution(int[] array, int height) {
	        int count = 0; // height보다 큰 숫자 개수
	        
	        // 배열의 요소가 height보다 클 때마다 count 가산
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > height) {
	                count++;
	            }
	        }
	        
	        return count; // 결과 반환
	    }
	}
}
