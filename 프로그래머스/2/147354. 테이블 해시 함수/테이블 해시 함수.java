import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {  
        Arrays.sort(data, (a, b) -> { 
        if(a[col-1] != b[col-1]){ 
            return a[col-1] - b[col-1];
        } else {
                return b[0] - a[0]; // 첫 번째 열 기준 내림차순
        }
});
        
        int answer = 0;
        for(int i = row_begin - 1; i <= row_end - 1; i++){
             int sum = 0;
             for(int val : data[i]){
                 sum += val % (i + 1); // i+1은 1-based 인덱스
}
            answer ^= sum;
        }
     return answer;
    }
}