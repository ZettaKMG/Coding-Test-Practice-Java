package Programmers.Lv0;

public class 치킨쿠폰 {
	class Solution {
	    public int solution(int chicken) {
	        int service_coupon = 0; // 서비스 쿠폰 담는 변수
	        int mod_coupon = 0; // 쿠폰으로 치킨 주문 후 남는 쿠폰 수
	        int service_chicken = 0; // 서비스 치킨 마리 수 담는 변수(결과값)

	        while (chicken >= 10) { // 치킨 10마리 이상 시켜먹었을 경우 아래 과정들을 반복 수행(chicken < 10 이 된 순간 종료)
	            service_coupon = chicken / 10; // 쿠폰 10장당 치킨 1마리이므로 이를 서비스 쿠폰에 반영
	            mod_coupon = chicken % 10; // 쿠폰 10장(치킨 10마리)당 서비스 치킨 1마리이므로 시켜먹은 치킨 수에서 10을 나눈 나머지가 남는 쿠폰 수
	            service_chicken += service_coupon; // 위에서 반영된 서비스 쿠폰 변수값만큼 서비스 치킨 수에 반영
	            chicken = service_coupon + mod_coupon; // chicken 변수에 service_coupon과 mod_coupon의 합을 대입
	        }        

	        return service_chicken; // 결과 반환
	    }
	}
}
