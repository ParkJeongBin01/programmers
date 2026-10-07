class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스 치킨 수
        int coupon = chicken; // 처음 주문한 치킨으로 받은 쿠폰

        while(coupon >= 10) {
            answer += coupon / 10; // 쿠폰으로 받을 수 있는 서비스 치킨
            coupon = coupon / 10 + coupon % 10; // 서비스 치킨에서 받은 쿠폰 + 남은 쿠폰
        }

        return answer;
    }
}