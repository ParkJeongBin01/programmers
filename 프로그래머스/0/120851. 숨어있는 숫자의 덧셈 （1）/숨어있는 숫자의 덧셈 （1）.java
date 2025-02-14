import java.util.*;
class Solution {
    public int solution(String my_string) {
        // 1. 결과를 저장할 변수 초기화
        int answer = 0;
        
        // 2. 문자열을 문자 배열로 변환하여 순회
        for(char c : my_string.toCharArray()){
            // 3. 현재 문자가 숫자인지 확인
            if(Character.isDigit(c)){
                // 4. 숫자라면 해당 숫자를 정수로 변환하여 answer에 더하기
                answer += Character.getNumericValue(c);
          }
        }
    
        // 5. 결과 반환
        return answer;
    }
}