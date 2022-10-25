package Programmers.Lv0;

public class 진료순서정하기 {
	function solution(emergency) {
		// emergency를 순서대로 정렬하기 위한 Map 셋팅
		let order = new Map();
		let desc = [...emergency].sort((a, b) => b - a);
		
		// emergency를 순서대로 정렬 후, Map 객체에 번호 부여
		for (let i = 0; i < desc.length; i++) {
			order.set(desc[i], i + 1);
		}
		
		// 부여된 숫자에 맞는 순서 찾아주기
		return emergency.map(v => order.get(v));
	}
}
