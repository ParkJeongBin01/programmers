import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        
        // 팩토리얼 배열 만들기: fact[i] = i!
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++){
            fact[i] = fact[i - 1] * i;
        }
        
        k--;
        // k를 1-index -> 0->index로 변환.
        // 예 : k=4 -> 0-index에서는 3번째 위치
        
        for(int i = 0; i < n; i++){
            long unit = fact[n - i - 1];
            int idx = (int)(k / unit);    
            answer[i] = list.get(idx);  
            list.remove(idx);           
            k %= unit;     
        }
        
        return answer;
    }
}