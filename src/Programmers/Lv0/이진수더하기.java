package Programmers.Lv0;

public class 이진수더하기 {
	class Solution {
	    public String solution(String bin1, String bin2) {
	        String binary_number_sum = ""; // 결과값 담을 변수
	        int a = Integer.parseInt(bin1, 2); // bin1을 이진수로 환산
	        int b = Integer.parseInt(bin2, 2); // bin2를 이진수로 환산
	        
	        binary_number_sum = Integer.toBinaryString(a + b); // 환산한 두 이진수를 더함
	        
	        return binary_number_sum; // 결과 반환
	    }
	}
}
