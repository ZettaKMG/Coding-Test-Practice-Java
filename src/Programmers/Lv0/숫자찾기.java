package Programmers.Lv0;

public class 숫자찾기 {
	class Solution {
	    public int solution(int num, int k) {
	        String num_str = String.valueOf(num);
	        String k_str = String.valueOf(k);
	        int result = num_str.indexOf(k_str);
	        
	        return result >= 0 ? (result + 1) : -1;
	    }
	}
}
