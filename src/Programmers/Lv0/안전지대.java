package Programmers.Lv0;

public class 안전지대 {
	class Solution {
	    public int solution(int[][] board) {
	        int count = 0; // 안전지역 칸 수 담을 변수
	        int length = board.length; // 길이
	        int[][] temp = new int[length + 2][length + 2]; // 길이를 2 늘린 액자용 배열 생성 -> 이러면 단순한 조건식으로 안전영역 구할 수 있음

	        // 액자에 board 이식
	        for(int i = 1; i < length + 1; i++) {
	            for(int j = 1; j < length + 1; j++) {
	                temp[i][j] = board[i - 1][j - 1];
	            }
	        }      
	        
	        //위험지대 찾기
	        for (int i = 1; i < length + 1; i++) {
	            for (int j = 1; j < length + 1; j++) {
	                if (temp[i][j] == 1) {
	                    for (int k = i - 1; k <= i + 1; k++) {
	                        for (int l = j - 1; l <= j + 1; l++) {
	                            if (temp[k][l] != 1) {
	                                temp[k][l] = 2;
	                            }
	                        }
	                    }
	                }
	            }
	        }

	        // 안전지대 카운트
	        for (int m = 1; m < length + 1; m++) {
	            for (int n = 1; n < length + 1; n++) {
	                if (temp[m][n] == 0) {
	                    count++;
	                }
	                System.out.print(temp[m][n]);
	            }
	            System.out.println("");
	        }

	        return count; // 결과 반환
	    }
	}
}
