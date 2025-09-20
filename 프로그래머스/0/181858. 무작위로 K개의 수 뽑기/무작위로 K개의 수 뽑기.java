import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
//         int[] answer = new int[k];
//         Arrays.fill(answer, -1);
//         int index = 0;
        
//         for(int i = 1; i < arr.length; i++){
//             if(arr[i-1] != arr[i]){ // 값이 다르면
//                 if(arr[i-1] < k){ // k보다 작으면
//                     answer[index] = arr[i-1];
//                     index++;
//                 } else {
//                     index++;
//                 }
//             }
//         }

//         if(arr[arr.length-1] < k && index < k){
//             answer[index] = arr[arr.length-1];
//         }
        // 테스트만 성공...
        // //--------
        int[] answer = new int[k];                              // 길이가 k인 결과 배열
        int[] karr = Arrays.stream(arr).distinct().toArray();
        int len = karr.length;
        
        // arr 배열에서 중복 제거 후 새로운 배열 생성
        for(int i = 0; i < answer.length; i++){
            if(len != 0){                                       // 아직 중복 제거된 값이 남아 있으면
                len--;
                answer[i] = karr[i];
            } else
                answer[i] = -1;                                 // 없으면 -1로 채움
        }
    
        return answer;
    }
}