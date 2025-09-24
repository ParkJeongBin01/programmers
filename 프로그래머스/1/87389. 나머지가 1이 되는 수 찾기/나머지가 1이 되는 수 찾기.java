class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        
        while(count < 999999){
            if(n % count == 1){
                answer = count;
                break;
            }
            count++;
        }
        
        return answer;
    }
}