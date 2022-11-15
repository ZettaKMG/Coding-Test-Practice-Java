package Programmers.Lv0;

public class l7의개수 {
	class Solution {
	    public int solution(int[] array) {
	        int count = 0; // 구하려는 7의 개수
	        String str = ""; // 숫자 배열을 문자열로 담기 위한 변수
	        
	        // 숫자 배열을 문자열로 변환하기
	        for(int i = 0; i < array.length; i++){
	            str += array[i];
	        }

	        // 문자열로 변환된 숫자 중에서 7의 개수 세기
	        for(int j = 0; j < str.length(); j++){
	            if(str.substring(j, j + 1).equals("7")) {
	                count++;
	            }
	        }

	        return count; // 결과 반환
	    }
	}
}
