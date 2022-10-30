package Programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {
	class Solution {
		public int[] solution(int n) {
			List<Integer> factorization_number = new ArrayList<>();
			
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					factorization_number.add(i);
					
					while (n % i == 0) {
						n /= i;
					}
					
				}
			}
			
			int[] result = factorization_number.stream().mapToInt(i -> i).toArray();
			
			return result;
		}
	}
}
