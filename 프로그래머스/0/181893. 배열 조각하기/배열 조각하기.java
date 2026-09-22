import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){ // 짝수일 경우, 인덱스 뒷부분 자르기.
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else{ // 홀수일 경우, 인데스 앞부분 자르기.
                arr = Arrays.copyOfRange(arr,query[i], arr.length);    
            }  
        }
        
        return arr;
    }
}