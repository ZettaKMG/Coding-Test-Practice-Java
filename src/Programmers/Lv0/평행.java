package Programmers.Lv0;

public class 평행 {
	class Solution {
	    public int solution(int[][] dots) {
	        float[] temp = new float[6]; // 기울기 값(y값의 변화량 / x값의 변화량) 비교를 위한 요소를 담을 배열 생성
	        int result = 0; // 결과값을 담는 변수

	        // 기울기 값 비교를 위한 배열 안의 요소들
	        temp[0] = (float) (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
	        temp[1] = (float) (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
	        temp[2] = (float) (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
	        temp[3] = (float) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
	        temp[4] = (float) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
	        temp[5] = (float) (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);

	        // 기울기 값 요소들을 비교하기
	        for (int i = 0; i < 6; i++) {
	            for (int j = i + 1; j < 6; j++) {
	                if (temp[i] == temp[j]) {
	                    result = 1; // 기울기 값 요소들을 비교했을 때 같은 경우가 있을 때(평행하는 경우가 존재)만 결과값 1 반환
	                }
	            }
	        }

	        return result; // 결과 반환(기울기가 같은(평행인) 경우가 있으면 1, 없으면 0)
	    }
	}
}
