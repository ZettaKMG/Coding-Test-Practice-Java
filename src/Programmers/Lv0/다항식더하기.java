package Programmers.Lv0;

public class 다항식더하기 {
	class Solution {
	    public String solution(String polynomial) {
	        int count_x = 0; // 문자 x의 총 갯수를 담는 변수
	        int num = 0; // polynomial 내에 포함된 숫자를 담는 변수

	        for (String str : polynomial.split(" ")) { // polynomial을 해체 후 탐색
	            if (str.contains("x")) { // 탐색 중에 x가 있을 경우
	                count_x += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", "")); // 탐색 결과 x가 나올 때마다 1씩 count_x를 더하고, 아니면 x를 공백으로 대체
	            } else if (!str.equals("+")) { // 탐색 중에 x가 없고, +가 아닌 경우
	                num += Integer.parseInt(str); // 탐색 중의 숫자들을 더함
	            }
	        }
	        
	        return (count_x != 0 ? count_x > 1 ? count_x + "x" : "x" : "") + (num != 0 ? (count_x != 0 ? " + " : "") + num : count_x == 0 ? "0" : ""); // 결과 반환
	    }
	}
}
