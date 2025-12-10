// class Solution {
//     public String solution(String s) {
//         String oddnumber = "";
//         String evennumber = "";
        
//         StringBuilder sb = new StringBuilder();
        
//         for(char c : s.toCharArray()){
//             sb.append(c);
//         }
        
//         if(sb.length() % 2 == 1){
//             return oddnumber = String.valueOf(sb.charAt(sb.length() / 2));
//         } else {
//             for(int i = 0; i < sb.length(); i++){           
//                 if(i == (sb.length() / 2) - 1 || i == (sb.length() / 2)){
//                     evennumber += String.valueOf(sb.charAt(i));
//                 }
//             }
//             return evennumber;
//         }
//     }
// }
// ------------------------------------------
// class Solution {
//     public String solution(String s) {
//         String oddnumber = "";
//         String evennumber = "";
        
//         if(s.length() % 2 == 1){
//             return oddnumber = String.valueOf(s.charAt(s.length() / 2));
//          } else {
//             for(int i = 0; i < s.length(); i++){
//                 if(i == (s.length() / 2) - 1 || i == s.length() / 2){
//                     evennumber += String.valueOf(s.charAt(i));
//                 }
//             }
//             return evennumber;
//         }
//     }
// }
// ------------------------------------------
class Solution {
    public String solution(String s) {
        int mid = s.length() / 2; 
        
        if(s.length() % 2 == 1){ // 홀수
            return s.substring(mid, mid + 1);
         } else { // 짝수
            return s.substring(mid - 1, mid + 1);
        }
    }
}
