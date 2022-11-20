package Programmers.Lv0;

public class 등수매기기 {
	class Solution {
	    public int[] solution(int[][] score) {
	        int[] result = new int[score.length]; // 등수 결과를 담을 배열 생성
	        int[] total = new int[score.length]; // 총점으로 등수 매기기 위한 총점을 담을 배열 생성(총점이 높을수록 평균도 높음)
	        
	        for (int i = 0; i < score.length; i++) { // sum 배열에 들어갈 총점 요소 생성
	            total[i] += score[i][0] + score[i][1];
	        }
	        
	        for (int i = 0; i < total.length; i++) {
	            int grade = 1; // 초기 등수 값을 1로 설정
	            
	            for (int j = 0; j < total.length; j++) { 
	                if (total[i] < total[j]) { 
	                    grade++; // 총점이 상대적으로 낮은 쪽의 등수 값을 높임
	                }
	            }
	            
	            result[i] = grade; // 등수를 매긴 것을 result 배열에 담음
	        }

	        return result; // 결과 반환
	    }
	}
}
