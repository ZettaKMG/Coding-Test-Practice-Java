package Programmers.Lv0;

public class 짝수는싫어요 {
	function solution(n) {
		let array = [];
		
		for (let i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				array = [...array, i];
			}
		}
		
		return array;
	}
}
