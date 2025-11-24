// import java.util.*;
// class Solution {
//     public int[] solution(int n, long left, long right) {
//         int length = (int)(right - left + 1);
//         int[] answer = new int[length];
        
//         int[][] array = new int[n][n];
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 array[i][j] = Math.max(i + 1, j + 1); 
//             }
//         }
        
        
//         List<Integer> List = new ArrayList<>();
        
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 List.add(array[i][j]);
//             }
//         }
                               
//         for(int i = 0; i < length; i++){
//             answer[i] = List.get((int)left);
//             left++;
//         }
            
//         return answer;
//     }
// }

//----------------------------------------------------

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];

        for (long idx = left; idx <= right; idx++) {
            int row = (int)(idx / n);
            int col = (int)(idx % n);
            answer[(int)(idx - left)] = Math.max(row + 1, col + 1);
        }

        return answer;
    }
}