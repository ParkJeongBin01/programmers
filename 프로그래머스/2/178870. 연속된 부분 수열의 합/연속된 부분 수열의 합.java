import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int n = sequence.length; // sequence 길이.
        int lt = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        
        for(int rt = 0; rt < n; rt++){
            sum += sequence[rt];
            if(sum == k){
                if(length > rt - lt + 1){
                    length = rt - lt + 1;
                    if(length == 1){
                    answer[0] = rt;
                    answer[1] = rt;
                    } else{
                        answer[0] = lt;
                        answer[1] = rt;    
                    }
                }
            }
            while(sum > k){
                sum -= sequence[lt++];
                if(sum == k){
                    if(length > rt - lt + 1){
                        length = rt - lt + 1;
                        if(length == 1){
                        answer[0] = rt;
                        answer[1] = rt;
                        } else{
                            answer[0] = lt;
                            answer[1] = rt;    
                        }
                    }
                }
            }
        }
        return answer;
    }
}