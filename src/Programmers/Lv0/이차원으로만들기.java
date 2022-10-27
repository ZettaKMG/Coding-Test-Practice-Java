package Programmers.Lv0;

public class 이차원으로만들기 {
	function solution(num_list, n) {
		let answer = [];
		
		for (let i = 0; i < num_list.length / n; i++) {
			answer = [...answer, num_list.slice(i * n, i * n + n)];			
		}
		
		return answer;
	}
}
