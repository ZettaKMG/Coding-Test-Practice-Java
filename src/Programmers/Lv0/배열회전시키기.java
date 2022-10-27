package Programmers.Lv0;

public class 배열회전시키기 {
	class Solution {
		public int[] solution(int[] numbers, String direction) {
			if (direction.equals("right")) {
				// 기존의 마지막 항
				int last_value = numbers[numbers.length - 1];
				
				// 기존 항들을 한 칸씩 오른쪽으로 밀어주기
				for (int i = numbers.length - 1; i > 0; i--) {
					numbers[i] = numbers[i - 1];
				}
				
				numbers[0] = last_value; // 기존의 마지막 항을 첫 항으로 이동				
			} else if (direction.equals("left")) {
				int first_value = numbers[0]; // 기존의 첫 항
				
				// 기존의 항들을 한 칸씩 왼쪽으로 밀어주기
				for (int i = 0; i < numbers.length - 1; i++) {
					numbers[i] = numbers[i + 1];
				}
				
				numbers[numbers.length - 1] = first_value; // 기존의 첫 항을 마지막 항으로 이동
			}
			
			return numbers;
		}
	}
}
