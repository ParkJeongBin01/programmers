import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        // 왼쪽 부분에 포함된 고유한 토핑을 추적할 Set
        Set<Integer> leftSet = new HashSet<>();
        // 오른쪽 부분에 포함된 고유한 토핑을 추적할 Set
        Map<Integer, Integer> rightMap = new HashMap<>();
        
        // 처음에 오른쪽 부분에 모든 토핑을 넣기
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }
        
        // 왼쪽 부분에 토핑을 하나씩 추가하면서 확인
        for (int i = 0; i < topping.length - 1; i++) {
            // 왼쪽 그룹에 토핑 추가
            leftSet.add(topping[i]);
            // 오른쪽 그룹에서 해당 토핑 제거
            rightMap.put(topping[i], rightMap.get(topping[i]) - 1);
            if (rightMap.get(topping[i]) == 0) {
                rightMap.remove(topping[i]);
            }
            
            // 두 그룹에 포함된 고유한 토핑의 개수가 같으면 answer 증가
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}
