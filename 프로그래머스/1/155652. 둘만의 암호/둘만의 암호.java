import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            for(int j = 0; j < index; j++){
                a = (char)(a + 1);
                if(skip.contains(a + "")) j--;
                // String.contains() 메서드는 String 인자만 받을 수 있음.
                // " " (빈 문자열)을 더해주면 자동으로 String으로 변환됨.
                if((int)a > 122){
                    a -=26;
                    if(skip.contains(a + "")) j--;
                }
            }
            answer += a;
        }
        
        
        
        
        
        return answer;
    }
}