package Programmers.Lv0;

public class 약수구하기 {
	class Solution {
	    public int[] solution(int n) {
	        int[] array = {};
	        array = new int[n];
	        int div = 0;
	        
	        for (int i = 1; i <= n; i++) {
	            if(n % i == 0) {
	                array[div++] = i;
	            }
	        }
	        
	        int[] result = new int[div];
	        
	        for (int i = 0; i < div; i++){
	            result[i] = array[i];
	        }

	        return result;
	    }
	}
}
