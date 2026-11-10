class Solution {
    public String solution(String[] str_list, String ex) {
        // 정석 코드
        String answer = "";
        
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
               
        return answer;
        // 여기까지
            
               
        // 내가 한 지저분한 코드
//         String answer = "";
    
//         for(int i = 0; i < str_list.length; i++){
//           boolean b = false;
//             int count = 0;
//             int k = 0;
//             for(int j = 0; j < str_list[i].length(); j++){
//                 if(str_list[i].charAt(j) == ex.charAt(k)){
//                     k++;
//                     count++;
//                 }
//                 if(count == ex.length()){
//                   b = true;
//                         break;
//                 }
                
//             }
//             if(!b){
//               answer += str_list[i];
//             }
            
//         }
//         return answer;
        // 여기까지

    }
}