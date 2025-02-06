class Solution {
    public int solution(int[] dot) {
        int x = dot[0]; // x좌표
        int y = dot[1]; // y좌표
        
        if(x > 0 && y > 0){
            return 1;
        } else if( x < 0 && y > 0){
            return 2;
        } else if( x < 0 && y < 0){
            return 3;
        } else{
            return 4;
        }
    }
}