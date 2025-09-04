class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = 0;
        int direction = 0;
        
        // (오른쪽, 아래, 왼쪽, 위) 순서
        int[] dx = {0, 1, 0, -1}; // 행 방향
        int[] dy = {1, 0, -1, 0}; // 열 방향
        
        while(num <= n * n){
            answer[x][y] = num++; // 현재 위치에 숫자 채우고 증가
            
            // 다음 이동할 위치 계산
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            
            // 다음 위치가 배열 범위를 벗어나거나 이미 채워져 있다면
            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0){
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            
            // 다음 위치로 이동
            x = nx;
            y = ny;
        }
        return answer;
    }
}