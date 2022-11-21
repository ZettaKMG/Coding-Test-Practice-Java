package Programmers.Lv0;

public class k의개수 {
	class Solution {
	    public int solution(int i, int j, int k) {
	        int result = 0; // 결과값 담을 변수

	        for (int n = i; n <= j; n++) {
	            int temp = n; // n을 담을 임시 변수
	            
	            while (temp != 0) { // n이 0이 될 때까지 아래 과정 반복
	                if (temp % 10 == k) {
	                    result++; // n이 10으로 나눴을 때 나머지가 k일 때마다 result를 1씩 더함
	                }                
	                temp /= 10; // n이 10으로 나눴을 때 나머지가 k가 아니면 n을 10으로 나눔
	            }
	        }
	        
	        return result; // 결과 반환
	    }
	}
}
