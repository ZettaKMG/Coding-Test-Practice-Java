package Programmers.Lv0;

public class 주사위의개수 {
	class Solution {
		public int solution(int[] box, int n) {
			double width = Math.floor(box[0] / n);
			double vertical = Math.floor(box[1] / n);
			double height = Math.floor(box[2] / n);
			
			return (int) width * (int) vertical * (int) height;
		}
	}
}
