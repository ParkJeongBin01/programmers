import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int lt = 0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;
        
        for(int rt = 0; rt < sequence.length; rt++){
            sum += sequence[rt];

            while(sum > k){
                sum -= sequence[lt++];
            }
            
            if(sum == k){
                int length = rt - lt + 1;
                
                if(length < minlength){
                    minlength = length;
                    answer[0] = lt;
                    answer[1] = rt;
                }
            }
        }
        return answer;
    }
}