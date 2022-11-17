package Programmers.Lv0;

import java.util.Arrays;

public class 최댓값만들기2 {
	class Solution {
	    public int solution(int[] numbers) {
	        int max_multi = 0; // 곱의 최댓값 변수 생성

	        Arrays.sort(numbers); // numbers의 원소들을 크기 순서대로 배열(오름차순)

	        int multi1 = numbers[0] * numbers[1]; // 가장 작은 원소 2개의 곱(둘 다 음수일 경우 양수값)
	        int multi2 = numbers[numbers.length - 2] * numbers[numbers.length - 1]; // 가장 큰 원소 2개의 곱

	        max_multi = Math.max(multi1, multi2); // 두 수 중 큰 값을 반환
	        
	        return max_multi; // 결과 반환
	    }
	} 
}
