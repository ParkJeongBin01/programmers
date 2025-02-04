class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int plus = (n / a) * b; // 교환할 수 있는 콜라의 양
                answer += plus; // 총 콜라 양에 추가
            n = (n % a) + plus; // 남은 빈 병 수
        }
        return answer;
    }
}