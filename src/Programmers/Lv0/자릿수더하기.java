package Programmers.Lv0;

public class 자릿수더하기 {
	class Solution {
	    public int solution(int n) {
	        int result = 0;
	        String str = Integer.toString(n);
	        String[] array = str.split("");

	        for(int i = 0; i < array.length; i++) {
	            result += Integer.parseInt(array[i]);
	        }
	        
	        return result;
	    }
	}
}
