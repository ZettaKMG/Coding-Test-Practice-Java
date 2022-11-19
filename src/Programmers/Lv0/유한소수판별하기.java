package Programmers.Lv0;

public class 유한소수판별하기 {
	class Solution {
	    public int solution(int a, int b) {
	        int result = 1; // 결과값 담을 변수
	        int gcd = 0; // a와 b의 최대공약수 담을 변수
	        
	        for (int i = 1; i <= a; i++) {
	            if (a % i == 0 && b % i == 0) {
	                gcd = i; // a와 b의 최대공약수 찾기
	            }
	        }

	        b /= gcd; // b를 최대공약수로 나눠줌

	        while (b > 1) { // 최대공약수로 나눈 후, b값이 1보다 큰 경우
	            if (b % 2 == 0) {
	                b /= 2; // b가 2의 배수이면 2로 나눔
	            } else if (b % 5 == 0) {
	                b /= 5; // b가 5의 배수이면 5로 나눔
	            } else {
	                return 2; // b가 2의 배수도 5의 배수도 아니라면 분모의 소인수가 2와 5 이외의 것이 존재하므로 무한소수이기에 결과값 2 반환
	            }
	        }

	        return result; // 결과 반환(상기한 else 경우의 수를 제외하면 결과값 1 반환)
	    }
	}
}
