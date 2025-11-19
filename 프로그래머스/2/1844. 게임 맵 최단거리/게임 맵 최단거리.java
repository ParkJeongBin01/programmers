import java.util.*;

class Solution {
    int[] h = {1, -1, 0, 0}; // 아래, 위, 오른쪽, 왼쪽 방향
    int[] w = {0, 0, 1, -1}; // 아래, 위, 오른쪽, 왼쪽 방향
    public int solution(int[][] maps) {
        int n = maps.length;    // 행
        int m = maps[0].length; // 열
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0, 0, 1}); // 초기 시작 위치와 거리
        visited[0][0] = true; // 초기 시작위치는 방문함.
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if(x == n-1 && y == m-1) return dist;
            
            for(int k = 0; k < 4; k++){
                int nx = x + h[k];
                int ny = y + w[k];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(!visited[nx][ny] && maps[nx][ny] == 1){
                        q.offer(new int[]{nx, ny, dist+1}); // 새로운 위치와 늘어난 거리
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}