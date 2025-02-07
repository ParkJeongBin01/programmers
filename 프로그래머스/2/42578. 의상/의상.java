import java.util.*;
class Solution {
    public int solution(String[][] clothes) { // [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
        HashMap<String, Integer> map = new HashMap<>(); // HashMap 생성
        
        for(String[] cloth : clothes){
            String type = cloth[1]; // 옷의 종류    
            
            map.put(type, map.getOrDefault(type, 0)+1); // map = {"headgear": 2, "eyewear": 1}
        }
        
        int answer = 1; // 조합의 수 초기화
        
        // 각 종류의 옷 개수에 1을 더한 값을 곱함
        for (int count : map.values()) {  //map.values()는 2(headgear)와 1(eyewear)로 이루어진 Collection
            answer *= (count + 1); // 각 종류의 옷을 선택하지 않는 경우도 포함
        }
        
        return answer - 1; // 아무것도 입지 않는 경우를 제외
    }
}