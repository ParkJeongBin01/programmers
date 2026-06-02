class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean isZero = true;
        
        for(char c : n_str.toCharArray()){
            if(isZero && c == '0') continue;
                isZero = false;
                answer += c;
        }
        
        return answer;
    }
}