class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0; // answer을 0으로 초기화.
        boolean result = false; // result를 false로 초기화.
        
        if(ineq.equals("<") && eq.equals("=")){
            result = n <= m;
        } else if(ineq.equals(">") && eq.equals("=")){
            result = n >= m;
        } else if(ineq.equals("<") && eq.equals("!")){
            result = n < m;    
        } else if(ineq.equals(">") && eq.equals("!")) {
            result = n > m;
        }
        
        if(result){
            return 1;
        } else{
            return 0;
        }
    }
}