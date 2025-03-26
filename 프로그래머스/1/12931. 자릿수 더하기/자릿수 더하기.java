import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 숫자를 문자열로 변환.
        String str = String.valueOf(n);
        
        // 문자열의 각 문자를 숫자로 변환하여 더하기
        for(char c : str.toCharArray()){
            // answer += c - '0';    
            answer += Character.getNumericValue(c);
        }
        
        return answer;
    }
}