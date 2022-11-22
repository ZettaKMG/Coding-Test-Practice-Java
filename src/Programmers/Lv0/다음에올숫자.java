package Programmers.Lv0;

public class 다음에올숫자 {
	class Solution {
	    public int solution(int[] common) {
	        int last_number = 0; // 결과 변수 지정
	        int diff1 = common[1] - common[0]; // 공차 확인용 변수1
	        int diff2 = common[2] - common[1]; // 공차 확인용 변수2
	        
	        if (diff1 == diff2) { // 변수1과 변수2가 같으면 등차수열, 아니면 등비수열(제한사항에 따라)
	            last_number = common[common.length - 1] + diff1; // 배열의 마지막 원소에 공차를 더한 값
	        } else { // 변수1과 변수2가 다르므로 등비수열(제한사항에 따라)
	            last_number = common[common.length - 1] * (common[1] / common[0]); // 배열의 마지막 원소에 공비를 더한 값
	        }
	        
	        return last_number; // 결과 반환
	    }
	}
}
