class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        int[][] dp = new int[land.length][4];
        
        for(int i = 0; i < land[0].length; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                int max = Integer.MIN_VALUE;
                for(int k = 0; k < land[0].length; k++){
                    if(k != j){ // 같은 열은 제외
                        max = Math.max(max,dp[i-1][k]);
                    }
                }
                dp[i][j] = land[i][j] + max;
            }
        }
        
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, dp[land.length-1][j]);
        }
        
        return answer;
    }
}