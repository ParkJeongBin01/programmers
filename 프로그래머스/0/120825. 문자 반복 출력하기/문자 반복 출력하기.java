class Solution {
    public String solution(String my_string, int n) {
        String answer = "";     
        for(char string : my_string.toCharArray()){
            for(int i = 0; i < n; i++){
                answer += string;
            }
        }
        return answer;
    }
}