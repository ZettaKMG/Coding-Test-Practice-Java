package Programmers.Lv0;

public class 외계행성의나이 {
	function solution(age) {
		
		return [...('' + age)].map(num => String.fromCharCode('a'.charCodeAt(0) + + num)).join('');
	}
}
