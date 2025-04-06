import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String, Integer> discountmap = new HashMap<>();
        HashMap<String, Integer> wantmap = new HashMap<>();
        
        for(int i = 0; i < discount.length; i++){
            discountmap.put(discount[i], discountmap.getOrDefault(discount[i], 0)+1);
        }
        
        for(int i = 0; i < want.length; i++){
            wantmap.put(want[i], number[i]);
        }
        
        for(int i = 0; i <= discount.length - 10; i++){
            HashMap<String, Integer> current = new HashMap<>();
            for(int j = 0; j < 10; j++){ 
        String item = discount[i + j];
        current.put(item, current.getOrDefault(item, 0)+1);
    }
                
        // 안 되는 경우 먼저 체크
    boolean isValid = true;
    for (String key : wantmap.keySet()) {
        if (current.getOrDefault(key, 0) < wantmap.get(key)) {
            isValid = false;
            break; // 빠른 실패
        }
    }

    if (isValid) answer++;
}
        
        return answer;
    }
}