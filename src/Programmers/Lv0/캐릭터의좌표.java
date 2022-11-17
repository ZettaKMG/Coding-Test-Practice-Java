package Programmers.Lv0;

public class 캐릭터의좌표 {
	class Solution {
	    public int[] solution(String[] keyinput, int[] board) {
	        int[] result = {0, 0};  // 기준점 [0,0]
	        int x = board[0] / 2; // x좌표 기준 [x,0]
	        int y = board[1] / 2; // y좌표 기준 [0,y]

	        for (int i = 0; i < keyinput.length; i++) {
	            if (keyinput[i].equals("left") && result[0] != -x) {
	                result[0]--; // left 누를때마다 x좌표를 -1씩 이동(board 크기 내에서)
	            } else if (keyinput[i].equals("right") && result[0] != x) {
	                result[0]++; // right 누를때마다 x좌표를 +1씩 이동(board 크기 내에서)
	            } else if (keyinput[i].equals("down") && result[1] != -y) {
	                result[1]--; // left 누를때마다 y좌표를 -1씩 이동(board 크기 내에서)
	            } else if(keyinput[i].equals("up") && result[1] != y){
	                result[1]++; // right 누를때마다 y좌표를 +1씩 이동(board 크기 내에서)
	            }
	        }
	        
	        return result; // 결과 반환
	    }
	}
}
