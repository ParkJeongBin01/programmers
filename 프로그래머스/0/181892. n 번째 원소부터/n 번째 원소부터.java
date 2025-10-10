import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        for(int i = 0; i < num_list.length; i++){
            if(i >= n-1){
                return Arrays.copyOfRange(num_list, i, num_list.length);
            }
        }
        
        return new int[0];
    }
}