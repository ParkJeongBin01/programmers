class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n이 홀수
        if(n % 2 == 1){
            for(int i = 1; i <= n; i++){
                if(i % 2 == 1){
                    answer += i;
                }
            }
        } else {
        // n이 짝수
            for(int j = 1; j <= n; j++){
                if(j % 2 == 0){
                    answer += (j*j);
                }
            }
        }
        return answer;
    }
}