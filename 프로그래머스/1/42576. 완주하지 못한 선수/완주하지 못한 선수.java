import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // HashMap 객체 생성.
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 - put 방법 1
        for(int i = 0; i < participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        // 완주자 - put 방법 2
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                return key;
            }
        }
        
        return "";
    }
}