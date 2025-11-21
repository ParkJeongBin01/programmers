//----------------------xxxx 효율성 xxxx----------------------
// import java.util.*;
// class Solution {
//     public int solution(int []A, int []B) {
//         int answer = 0;
//         List<Integer> list_min = new ArrayList<>();
//         List<Integer> list_max = new ArrayList<>();
        
//         for(int i = 0; i < A.length; i++){
//             list_min.add(A[i]);
//             Collections.sort(list_min);
//         }
        
//         for(int j = 0; j < B.length; j++){
//             list_max.add(B[j]);
//             Collections.sort(list_max, Collections.reverseOrder());
//         }

//         for(int k = 0; k < A.length; k++){
//             answer += list_min.get(k) * list_max.get(k);
            
//         }
        
//         return answer;
//     }
// }

//---------------------- 효율성 ----------------------
import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);              // A 오름차순
        Arrays.sort(B);              // B 오름차순
        // B를 내림차순으로 곱하려면 B[ B.length-1 - k ] 사용

        for (int k = 0; k < A.length; k++) {
            answer += A[k] * B[B.length - 1 - k];
        }

        return answer;
    }
}
