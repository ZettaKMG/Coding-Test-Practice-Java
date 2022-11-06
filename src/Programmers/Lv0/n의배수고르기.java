package Programmers.Lv0;

import java.util.ArrayList;

public class n의배수고르기 {
	class Solution {
	    public int[] solution(int n, int[] numlist) {
	        ArrayList<Integer> List = new ArrayList<>();
	        
	        for (int i = 0;i < numlist.length; i++) {
	            if (numlist[i] % n == 0) {
	                List.add(numlist[i]);
	            }        
	        }    
	        
	        int[] result = new int[List.size()];
	        
	        for (int i = 0; i< List.size(); i++) {
	            result[i] = List.get(i);
	        }
	        
	        return result;
	    }
	}
}
