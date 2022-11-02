package Programmers.Lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 한번만등장한문자 {
	class Solution {
	    public String solution(String s) {

	        HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < s.length(); i++) {
	            String replace = s.replace(s.charAt(i) + "", "");
	            
	            if(s.length() - replace.length() == 1){
	                set.add(s.charAt(i)+"");
	            }            
	        }
	        
	        ArrayList<String> list = new ArrayList<>(set);
	        Collections.sort(list);
	        
	        return String.join("", list);
	    }
	}
}
