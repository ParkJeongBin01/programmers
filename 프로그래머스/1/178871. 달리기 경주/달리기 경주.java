import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {  
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 각 선수 이름과 인덱스를 매핑
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        // 2. callings 배열을 순회하며 인덱스 업데이트
        for(String calling : callings){ //["kai", "kai", "mine", "mine"] 순회
            int index = map.get(calling); // 호출된 선수의 인덱스(키값) 가져오기.
            if(index > 0){ // 0번은 이동 불가. (kai : 3 > 0)
                String temp = players[index-1]; //앞에 선수 이름 저장. (temp = "poe")
                players[index] = temp; // 앞에 선수를 호출된 선수 인덱스에 저장. (players=[3] = "poe")
                players[index-1] = calling; // 호출된 선수를 앞에 선수 인덱스에 저장. (players=[2] = "kai")
                
                // 3. HashMap 업데이트
                map.put(temp, index); 
                map.put(calling, index-1);
            }
            
        }
        
        return players;
    }
}