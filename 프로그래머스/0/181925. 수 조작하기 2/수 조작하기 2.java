class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        
        for(int i = 1; i < numLog.length; i++){ 
            int sum = 0;
            sum = numLog[i] - numLog[i - 1];
            if(sum == 1){
                answer += "w";
            } else if(sum == -1){
                answer += "s";
            } else if(sum == 10){
                answer += "d";
            } else {
                answer += "a";
            }
        }
        
        return answer;
    }
}