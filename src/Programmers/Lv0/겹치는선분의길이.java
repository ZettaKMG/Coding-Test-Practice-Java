package Programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class 겹치는선분의길이 {
	class Solution {
	    public int solution(int[][] lines) {
	        List<Integer> overlap = new ArrayList<>(); // 겹치는 부분을 담을 리스트 생성
	        int overlap_length = 0; // 겹치는 부분의 길이 결과값 담을 변수

	        for (int i = 0; i <= 2; i++) { // lines 배열 탐색
	            int small = lines[i][0] > lines[i][1] ? lines[i][1] : lines[i][0]; // 선분 좌표값 중 작은쪽
	            int big = lines[i][0] > lines[i][1] ? lines[i][0] : lines[i][1]; // 선분 좌표값 중 큰 쪽
	            
	            for (int j = small; j < big; j++){
	                if (overlap.contains(j)) { // 리스트에 j값이 포함된 경우
	                    overlap.remove(Integer.valueOf(j)); // 리스트에서 j값을 제거
	                    overlap_length++; // 결과값을 1씩 가산
	                } else {
	                    overlap.add(j); // 리스트에 j값이 없으면 j값을 리스트에 추가
	                } 
	            }
	        }
	        
	        return overlap_length; // 결과 반환
	    }
	}
}
