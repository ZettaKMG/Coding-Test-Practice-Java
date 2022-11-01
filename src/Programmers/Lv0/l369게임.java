package Programmers.Lv0;

public class l369게임 {
	class Solution {
		public int solution(int order) {
			String order_str = Integer.toString(order);
			int count = 0;
			
			for (int i = 0; i < order_str.length(); i++) {
				if (order_str.charAt(i) == '3') {
					count++;
				} else if (order_str.charAt(i) == '6') {
					count++;
				} else if (order_str.charAt(i) == '9') {
					count++;
				}
			}
			
			return count;
		}
	}
}
