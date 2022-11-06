package Programmers.Lv0;

public class OX퀴즈 {
	class Solution {
	    public String[] solution(String[] quiz) {
	        String[] result = new String[quiz.length];
	        
	        for (int i = 0; i < quiz.length; i++) {
	            String[] temp = quiz[i].trim().split(" ");
	            int X = Integer.parseInt(temp[0]);
	            int Y = Integer.parseInt(temp[2]);
	            int Z = Integer.parseInt(temp[4]);
	            
	            if (temp[1].equals("+")) {
	                if (X + Y == Z) {
	                    result[i] = "O";
	                }
	                else {
	                    result[i] = "X";
	                } 
	            } else if (temp[1].equals("-")) {
	                if(X - Y == Z) {
	                    result[i] = "O";
	                }
	                else {
	                    result[i] = "X";
	                }
	            }
	        }
	        
	        return result;
	    }
	}
}
