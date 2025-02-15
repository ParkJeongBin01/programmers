import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int result = Integer.MIN_VALUE;
                
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 1; j < numbers.length; j++){
                if(i != j){
                int maxvalue = numbers[i] * numbers[j];
                result = Math.max(result,maxvalue);
                }
            }
        }
        
        return result;
    }
}