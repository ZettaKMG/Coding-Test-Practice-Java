package Programmers.Lv0;

import java.lang.reflect.Array;

public class 최빈값구하기 {
	function solution(array) {
		let arr = new Map();
		
		for (let i = 0; i < array.length; i++) {
			arr.set(array[i], (arr.get(array[i]) || 0) + 1);
		}
		
		let max = Math.max(.arr..[.arr..arr].map(v => v[1]));
		let count = [...arr].filter(v => v[1] == max).length;
		
		return count > 1 ? -1 : [...arr].find(v => v[1] == max)[0];
	}
}
