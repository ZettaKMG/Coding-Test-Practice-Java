package Programmers.Lv0;

public class 저주의숫자3 {
	class Solution {
	    public int solution(int n) {
	        int result = 0; // 결과값을 담을 변수

	        for (int i = 1; i <= n; i++) {
	            result++; // 1부터 n까지 결과값을 1씩 가산함
	            if (result % 3 == 0 || String.valueOf(result).contains("3")) {
	                i--; // 결과값이 3의 배수이거나 결과값에 3이 들어가는 경우 i값을 1씩 감소
	            }
	        }

	        return result; // 결과 반환
	    }
	}
}
