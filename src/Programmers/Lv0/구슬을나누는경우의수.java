package Programmers.Lv0;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {
	class Solution {
		public BigInteger solution(int balls, int share) {
			BigInteger n = BigInteger.ONE;
			BigInteger m = BigInteger.ONE;
			long choose1 = balls - share > share ? balls - share : share;
			long choose2 = balls - share > share ? share : balls - share;
			
			for (long i = choose1 + 1; i <= balls; i++) {
				n = n.multiply(BigInteger.valueOf(i));
			}
			
			for (long j = 2L; j <= choose2; j++) {
				m = m.multiply(BigInteger.valueOf(j));
			}
			
			return n.divide(m);
		}
	}
}
