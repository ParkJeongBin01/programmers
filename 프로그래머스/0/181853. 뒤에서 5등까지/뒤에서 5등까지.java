import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        for(int i = 0; i < 5; i++){
            int tmp = num_list[i];    
            for(int j = i + 1; j < num_list.length; j++){
                if(tmp > num_list[j]){
                    tmp = num_list[j];
                    num_list[j] = num_list[i];
                    num_list[i] = tmp;
                }
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
}