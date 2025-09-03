class Solution {
    public int[] solution(String[] wallpaper) {
        int ldx = Integer.MAX_VALUE; // 시작점 x(최소행)
        int ldy = Integer.MAX_VALUE; // 시작점 y(최대열)
        int rdx = Integer.MIN_VALUE; // 끝점 x(최대행)
        int rdy = Integer.MIN_VALUE; // 끝점 y(최대열)
        
        for(int i = 0; i < wallpaper.length; i++){          // i : 행 인덱스(y 좌표)
            for(int j = 0; j < wallpaper[i].length(); j++){ // j : 열 인덱스(x 좌표)
                if(wallpaper[i].charAt(j) == '#'){  // 해당 위치 문자가 '#'이면
                    ldx = Math.min(ldx, i);         // 위쪽 끝(현재까지 찾은 최소 행과 i 중 더 작은 값.)
                    rdx = Math.max(rdx, i + 1);     // 아래쪽 끝 + 1(현재까지 찾은 최대 행과 i + 1 중 더 큰 값.)
                    ldy = Math.min(ldy, j);         // 왼쪽 끝(현재까지 찾은 최소 행과 j 중 더 작은 값.)
                    rdy = Math.max(rdy, j + 1);     // 오른쪽 끝 + 1(현재까지 찾은 최대 행과 j + 1 중 더 큰 값.)
                }
            }
        }
        
        return new int[]{ldx, ldy, rdx, rdy};
        
    }
}