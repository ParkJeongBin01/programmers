import java.util.*;
class Solution {
    public int solution(int n, String control) {
        int answer = n;
            
            StringBuilder sb = new StringBuilder();
        
//             for(char c : control.toCharArray()){
//                 sb.append(c); //"w","s","d","a","w","s","d","a","s","s","w"
//             }

//             for(int i = 0; i < sb.length(); i++){
//                 if(sb.charAt(i) == 'w'){
//                     answer += 1;
//                 } else if(sb.charAt(i) == 's'){
//                     answer -= 1;
//                 } else if(sb.charAt(i) == 'd'){
//                     answer += 10;
//                 } else {
//                     answer -= 10;
//                 }
//             }
        
                for(char c : control.toCharArray()){
                    if (c == 'w') answer += 1;
                    else if (c == 's') answer -= 1;
                    else if (c == 'd') answer += 10;
                    else if (c == 'a') answer -= 10;
                }

            
        return answer;
    }
}