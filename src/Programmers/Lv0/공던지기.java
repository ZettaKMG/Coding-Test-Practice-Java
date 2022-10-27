package Programmers.Lv0;

public class 공던지기 {
	class Solution {
		public int solution(int[] numbers, int k) {
			// 1번 사람이 공을 던짐
			int person_number = 1;
			
			// 마지막에 공을 던질 선수를 찾기 위해 k-1번까지 반복하며 다음 사람을 건너뛰도록 2씩 더해줌
			for (int i = 0; i < k - 1; i++) {
				person_number += 2;
				
				// 마지막 번호를 넘어가는 경우, 처음 선수에게 공이 넘어가도록 전달되게끔 배열 크기만큼 빼줌
				if (person_number > numbers.length - 1) {
					person_number -= numbers.length;
				}
			}
			
			return person_number;
		}
	}
}
