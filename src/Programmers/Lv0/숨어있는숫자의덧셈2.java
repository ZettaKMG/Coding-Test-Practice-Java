package Programmers.Lv0;

public class 숨어있는숫자의덧셈2 {
	class Solution {
	    public int solution(String my_string) {
	        int result = 0; // 결과를 담기 위한 변수

	        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" "); // my_string의 알파벳을 공백처리하여 숫자만 남김

	        for(String s : str) { // 알파벳을 걸러낸 배열을 탐색
	            if(!s.equals("")) { // 공백이 아닌 경우
	                result += Integer.valueOf(s); // 결과 변수에 str안에 포함된 숫자값들을 더해줌
	            }
	        }

	        return result; // 결과 반환
	    }
	}
}
