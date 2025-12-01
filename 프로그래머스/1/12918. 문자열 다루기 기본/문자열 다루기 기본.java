class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            sb.append(c);
        }
        
        for(int i = 0; i < s.length(); i++){
            if(sb.charAt(i) > 57){
                answer = false;
                break;
            }
            if(sb.charAt(i) <= 57 || sb.charAt(i) >= 48){
                if(s.length() == 4 || s.length() == 6){
                    answer = true;
                }
            } 
        }
        
        return answer;
    }
}