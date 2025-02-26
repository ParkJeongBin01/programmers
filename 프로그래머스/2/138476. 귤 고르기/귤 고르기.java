import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 귤의 종류와 개수 세기
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        // 귤의 개수를 리스트에 저장
        ArrayList<Integer> counts = new ArrayList<>(map.values());
        // 개수를 내림차순으로 정렬
        Collections.sort(counts, Collections.reverseOrder());
        
        // k개 이상의 귤을 선택하기 위한 로직
        for(int count : counts){
            if(k <= 0){
                break;
            }
            answer++;
            k -= count; // 귤의 개수를 k에서 빼기
        }
        
        return answer;
    }
}