package Programmers.Lv0;

public class 삼각형의완성조건2 {
	class Solution {
	    public int solution(int[] sides) {
	        int small = Math.min(sides[0], sides[1]); // sides의 두 값 중 작은값
	        int big = Math.max(sides[0], sides[1]); // sides의 두 값 중 큰 값
	        int sum = sides[0] + sides[1]; // sides의 두 값의 합
	        int count = 0; // 정수의 갯수를 담을 변수

	        for (int i = 1; i < sum; i++) {
	            if (i <= small || i < big) { // i가 중간값이거나 최솟값인 경우
	                if (big < small + i) { // big이 small과 i의 합보다 작게 되는 i값의 갯수만큼 count에 가산
	                    count++;
	                }
	            } else if (i >= big) { // i가 최댓값(가장 긴 변)인 경우
	                count++; // i가 big보다 크고 sum보다 작은 정수의 갯수만큼 count에 가산
	            }
	        }
	        
	        return count; // 결과 반환(두 경우를 모두 합친 결과)
	    }
	}
}
