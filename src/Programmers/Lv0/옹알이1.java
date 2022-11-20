package Programmers.Lv0;

public class 옹알이1 {
	class Solution {
	    public int solution(String[] babbling) {
	        int count = 0; // 발음 가능 단어 갯수 담는 변수

	        for (int i = 0; i < babbling.length; i++) { // babbling 탐색
	            // babbling 배열 요소 중 "aya", "woo", "ye", "ma"가 있으면 "1"로 대체
	            babbling[i] = babbling[i].replace("aya", "1");
	            babbling[i] = babbling[i].replace("woo", "1");
	            babbling[i] = babbling[i].replace("ye", "1");
	            babbling[i] = babbling[i].replace("ma", "1");
	            
	            // 위에서 대체된 "1"은 공백으로 처리
	            babbling[i] = babbling[i].replace("1", "");
	            
	            if (babbling[i].isEmpty()) {
	                count++; // 처리된 공백의 갯수만큼 결과값을 더해줌(발음 가능한 단어 갯수)
	            }
	        }

	        return count; // 결과 반환
	    }
	}
}
