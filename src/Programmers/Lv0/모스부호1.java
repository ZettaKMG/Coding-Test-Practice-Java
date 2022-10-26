package Programmers.Lv0;

public class 모스부호1 {
	function solution(letter) {
	    const morse = { 
	            '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
	            '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
	            '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
	            '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
	            '-.--':'y','--..':'z'
	        }
	    
	    return letter
	            .split(' ')
	            .map(l => morse[l])
	            .join('');
	}
}
