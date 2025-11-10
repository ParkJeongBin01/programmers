class Solution {
    public int solution(int a, int b) {
        
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        if((2 * a * b) < answer){
           return answer;
        } else {
           return 2 * a * b;
        }
        
    }
}