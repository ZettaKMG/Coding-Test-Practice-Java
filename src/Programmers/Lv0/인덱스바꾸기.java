package Programmers.Lv0;

public class 인덱스바꾸기 {
	class Solution {
	    public String solution(String my_string, int num1, int num2) {
	        String result = "";
	        String[] array = my_string.split("");
	        String temp = array[num1];        
	        array[num1] = array[num2];
	        array[num2] = temp;
	        
	        for(String str : array){
	            result += str;
	        }
	        
	        return result;
	    }
	}
}
