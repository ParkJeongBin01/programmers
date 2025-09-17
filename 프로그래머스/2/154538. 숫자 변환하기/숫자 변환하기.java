import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dist = new int[y+1];  // y+1로 제한하는 이유 : y보다 크면 볼 필요 없음.
        Arrays.fill(dist,-1);       // 모든 배열 안에 -1을 해줘서 아직 방문 안했다는 것을 의미.
        
        Queue<Integer> q = new LinkedList<>();
        q.add(x);                   // 시작점 x를 넣음.
        dist[x] = 0;                // 초기화(연산 0번).
        
        while(!q.isEmpty()){        // q가 비어있지 않으면.
            int cur = q.poll();     // q에서 꺼내 현재 값 cur처리.
            if(cur == y) return dist[cur];
            
            int[] nexts = {cur+n, cur*2, cur*3};
            for(int next : nexts){
                if(next <= y && dist[next] == -1){
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
        return -1;

    }
}