package Programmers.Lv0;

public class 잘라서배열로저장하기 {
	class Solution {
	    public String[] solution(String my_str, int n) {
	        int count = (my_str.length() + n - 1) / n; // n의 길이로 잘라서 나오는 배열 수
	        String[] result = new String[count]; // 결과를 담기 위한 새로운 배열 생성

	        // n의 길이로 자른 요소를 배열에 새로 담음
	        for (int i = 0; i < count; i++) {
	            int start = n * i;
	            int end = my_str.length() <= (start + n) ? my_str.length() : (start + n);
	            
	            result[i] = my_str.substring(start, end);
	        }

	        return result; // 결과 반환
	    }
	}
}
