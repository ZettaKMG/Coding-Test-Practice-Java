package Programmers.Lv0;

public class 두수의나눗셈 {
	// JavaScript로 해결
	function solution(num1, num2) {
		var answer = num1 / num2 * 1000;
		
		return Math.floor(answer); // 해당 숫자 이하 가장 큰 정수 반환
	}
}
