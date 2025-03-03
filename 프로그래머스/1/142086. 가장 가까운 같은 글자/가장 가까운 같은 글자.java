import java.util.*;
class Solution {
    public int[] solution(String s) {
        // 1. s의 길이를 기반으로 결과 배열 초기화
        int[] answer = new int[s.length()];
        
        // 2. 각 문자의 마지막 등장 위치를 저장할 HashMap 생성
        Map<Character, Integer> map = new HashMap<>();
        
        // 3. 문자열을 순회하며 각 문자의 등장 위치를 기록
        for(int i = 0; i < s.length(); i++){
            // 4. 현재 문자가 처음 등장하는 경우
            if(!map.containsKey(s.charAt(i))){
                answer[i] = -1; // 처음 등장하므로 -1 저장
                map.put(s.charAt(i), i); // 현재 인덱스를 기록
            } else {
                // 5. 현재 문자가 이미 등장한 경우
                answer[i] = i - map.get(s.charAt(i)); // 현재 인덱스와 마지막 등장 인덱스의 차이 계산
                map.put(s.charAt(i), i); // 현재 인덱스를 업데이트
            }
        }
        
        return answer; // 결과 배열 반환
    }
}
