package Programmers.Lv0;

public class 가위바위보 {
	function solution(rsp) {
		const rsp_win = {0 : 5, 2 : 0, 5 : 2};
		
		return [...rsp].map(num => rsp_win[num]).join('');
	}
}
