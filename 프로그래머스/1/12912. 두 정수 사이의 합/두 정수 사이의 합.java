class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b){
            for(long i = b; i <= a; i++){
                answer += i;
            }
        } else {
            for(long j = a; j <= b; j++){
                answer += j;
            }
        }
            
        
        return answer;
    }
}