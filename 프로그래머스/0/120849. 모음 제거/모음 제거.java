import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(); // 객체 생성
        Character[] momm = {'a', 'e', 'i', 'o', 'u'};    // Character 배열로 선언
        for(char string : my_string.toCharArray()){ // my_string을 char로 순환
            if(!Arrays.asList(momm).contains(string)){ // 모음이 아니면
                answer.append(string);   // answer에 추가.
            }
        }
        return answer.toString();
    }
}