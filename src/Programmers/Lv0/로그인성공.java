package Programmers.Lv0;

public class 로그인성공 {
	class Solution {
	    public String solution(String[] id_pw, String[][] db) {        
	        for(int i = 0; i < db.length; i++) { // db 탐색
	            if (db[i][0].equals(id_pw[0])) { 
	                if (db[i][1].equals(id_pw[1])) { 
	                    return "login"; // 결과 반환(db의 id가 일치하고, db의 pw와 id_pw의 pw가 일치하는 경우)
	                }                
	                return "wrong pw"; // 결과 반환(db의 id와 id_pw의 id는 일치, pw는 불일치하는 경우)
	            }
	        }        
	        return "fail"; // 결과 반환(db의 id와 id_pw의 id가 일치하지 않는 경우)
	    }
	}
}
