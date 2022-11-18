package Programmers.Lv0;

public class 외계어사전 {
	class Solution {
	    public int solution(String[] spell, String[] dic) {
	        for (int i = 0; i < dic.length; i++) { // dic 배열 탐색           
	            int index = 0; // spell에 들어있는 알파벳과 dic 배열을 대조할 매개변수
	            
	            for (int j = 0; j < spell.length; j++){ // spell 배열 탐색
	                if (dic[i].contains(spell[j])) {
	                    index++; // dic에 spell의 알파벳이 들어있는 경우 1회씩만 세서 index값에 더해줌
	                }
	            }
	            
	            if (index == spell.length) {
	                return 1; // 결과 반환(dic에 spell의 알파벳을 1회만 모두 썼을 경우)
	            }
	        }
	        
	        return 2; // 결과 반환(dic에 spell의 알파벳이 없거나, spell 알파벳을 1회만 모두 써서 만들 수 있는 단어가 dic에 없는 경우)
	    }
	}
}
