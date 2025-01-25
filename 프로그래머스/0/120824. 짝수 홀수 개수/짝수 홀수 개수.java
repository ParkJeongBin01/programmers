class Solution {
    public int[] solution(int[] num_list) {
//         int n = 0; //짝수 개수
//         int m = 0; //홀수 개수
        
//         for(int num : num_list){
//             if(num % 2 == 0){
//                 n++; //짝수인 경우
//             } else{
//                 m++; //홀수인 경우
//             }
//         }
//         int[] result= {n,m};
//         return result;
//     }
//------------------------------------------//
//         int n = 0; //짝수 개수
//         int m = 0; //홀수 개수
        
//         for(int num : num_list){
//             if(num % 2 == 0){
//                 n++; //짝수인 경우
//             } else{
//                 m++; //홀수인 경우
//             }
//         }
        
//         return new int[] {n,m};
//    }
//------------------------------------------//
        int n = 0; //짝수 개수
        int m = 0; //홀수 개수
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                n++; //짝수인 경우
            } else{
                m++; //홀수인 경우
            }
        }
        
        return new int[] {n,m};
   }            
}