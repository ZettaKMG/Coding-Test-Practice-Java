package Programmers.Lv0;

public class 개미군단 {
	class Solution {
		public int solution(int hp) {
			double general = Math.floor(hp / 5);
			double soldier = Math.floor((hp - general * 5) / 3);
			double worker = hp - general * 5 - soldier * 3;
			double answer = general + soldier + worker;
			
			return (int) answer;
		}
	}
}
