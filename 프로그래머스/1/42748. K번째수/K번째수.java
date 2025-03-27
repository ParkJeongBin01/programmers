import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length]; 
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int target = commands[i][2]-1;
            // int[] numbers = new int[end-start];
         
            // 부분 배열 추출
            int[] numbers = Arrays.copyOfRange(array, start, end);
            
            // // 부분 배열 추출
            // for(int j = 0; j < numbers.length; j++){
            //     numbers[j] = array[start+j];
            // }
            
         
            Arrays.sort(numbers);

            answer[i] = numbers[target];
        }
        
        return answer;
    }
}