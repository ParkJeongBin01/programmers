import java.util.*;
class Solution {
    public String solution(String s) {
        s = s.toLowerCase(); // 모든 문자를 소문자로 만듬.
        
        String[] str = s.split(" ", -1);
        
        for(int i = 0; i < str.length; i++){
            if(str[i].length() == 0){
                continue;
            }
            if(Character.isDigit(str[i].charAt(0))){
                continue;
            } else{
                str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1);
            }
        }
        
        return String.join(" ", str);
    }
}