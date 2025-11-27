class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
         
        for(int i = 3; i <= sum / i; i++){
            for(int j = 3; j <= sum / 2; j++){
                if(sum == i * j){
                    if((j - 2) * (i - 2) == yellow){
                        answer[0] = j;
                        answer[1] = i;
                        break;
                    }
                }
            }
        }
        
        
        return answer;
    }
}