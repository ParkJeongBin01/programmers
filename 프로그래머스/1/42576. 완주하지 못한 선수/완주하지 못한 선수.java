import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ""; // 완주하지 못한 선수 이름.
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++){ // 선수들 목록
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int j = 0; j < completion.length; j++){ // 선수들 목록에서 완주한 선수들 이름 빼기
            map.put(completion[j], map.get(completion[j]) - 1);
        }
        
        for(String key : map.keySet()){ // map에서 완주하지 못한 선수 이름을 answer에 반환.
            if(map.get(key) != 0){
                answer += key;
            }
        }
        
        return answer;
    }
}