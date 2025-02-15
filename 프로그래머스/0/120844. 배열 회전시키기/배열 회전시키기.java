class Solution {
    public int[] solution(int[] numbers, String direction) {
//         // 1. direction쪽으로 회전 한 배열 생성 초기화
//         int[] answer = new int[numbers.length];
        
//         // 2. for문으로 순회하면서 direction이 right면 오른쪽으로 아니면 left로 회전하기.
//         if(direction.equals("right")){
//             for(int i = 0; i <= numbers.length; i++){
//                 if(i < numbers.length-1){
//                 answer[i + 1] = numbers[i];
//                 } else{
//                     answer[0] = numbers[numbers.length-1];
//                 }
//             } 
//         } else{
//             for(int i = 0; i <= numbers.length; i++){
//                 if(i < numbers.length-1){
//                 answer[i] = numbers[i+1];
//                 } else{
//                     answer[numbers.length-1] = numbers[0];
//                 }
//             }
//         }
//         // 3. 결과 반환.
//         return answer;
        
//-----------------------------------------------------------------------------
        // 1. direction쪽으로 회전 한 배열 생성 초기화
        int[] answer = new int[numbers.length];
        
        // 2. for문으로 순회하면서 direction이 right면 오른쪽으로 아니면 left로 회전하기.
        for(int i = 0; i < numbers.length; i++){
            if(direction.equals("right")){
                answer[(i + 1) % numbers.length] = numbers[i];
            } else{
                answer[(i - 1 + numbers.length) % numbers.length] = numbers[i];
            }
        }
        // 3. 결과 반환.
        return answer;
    }
}