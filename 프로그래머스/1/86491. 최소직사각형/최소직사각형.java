class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wmax = 0;
        int hmax = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int w = Math.min(sizes[i][0], sizes[i][1]);
            int h = Math.max(sizes[i][0], sizes[i][1]);
            
            wmax = Math.max(wmax, w);
            hmax = Math.max(hmax, h);
        }
        
        return answer = wmax * hmax;
    }
}