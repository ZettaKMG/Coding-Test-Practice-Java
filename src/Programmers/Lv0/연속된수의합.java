package Programmers.Lv0;

public class 연속된수의합 {
	class Solution {
	    public int[] solution(int num, int total) {
	        int[] sorted_result = new int[num]; // 오름차순으로 정렬된 결과를 담을 배열
	        int check = num * (num + 1) / 2; // 1부터 num까지의 정수들의 총합
	        int start = (total - check) / num + 1; // 연속된 수 num 개만큼 더해 total이 나오게 하기 위한 시작 수
	        
	        for (int i = 0; i < sorted_result.length; i++) {
	            sorted_result[i] = start + i; // 결과 담을 배열을 오름차순으로 채워넣기
	        }
	        
	        return sorted_result; // 결과 반환
	    }
	}
}
