package Programmers.Lv0;

public class 직사각형넓이구하기 {
	class Solution {
	    public int solution(int[][] dots) {
	        // 가로(x좌표)와 세로(y좌표)의 최대/최소값 지정
	        int max_x = -256;
	        int min_x = 256;
	        int max_y = -256;
	        int min_y = 256;
	        
	        // 지정된 최대/최소값을 입력된 좌표값으로 치환
	        for(int i = 0; i < dots.length; i++){
	            max_x = Math.max(max_x, dots[i][0]);
	            min_x = Math.min(min_x, dots[i][0]);
	            max_y = Math.max(max_y, dots[i][1]);
	            min_y = Math.min(min_y, dots[i][1]);
	        }        
	        
	        // 가로와 세로 길이 변수 지정
	        int width = max_x - min_x;
	        int length = max_y - min_y;

	        return width * length; // 결과 반환
	    }
	}
}
