package Programmers.Lv0;

public class 문자열밀기 {
	class Solution {
	    public int solution(String A, String B) {
	        int result = -1; // 기본 결과값은 A를 밀어 B가 될 수 없는 경우로 지정
	        
	        for (int i = 0; i < A.length(); i++) {
	            if (A.equals(B)) {
	                result = i; // A가 B와 일치하면, 결과값은 i를 반환하고 for문 중단
	                break; 
	            }
	            
	            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1); // A의 끝문자와 A의 첫 문자부터 끝문자까지 덧붙여 A로 반환(break 되기 전까지)
	        }
	        
	        return result; // 결과 반환
	    }
	}
}
