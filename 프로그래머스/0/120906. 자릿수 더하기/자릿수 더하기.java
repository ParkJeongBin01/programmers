class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;   //나머지
            n /= 10;            //몫
        }
        
        return answer;
    }
}