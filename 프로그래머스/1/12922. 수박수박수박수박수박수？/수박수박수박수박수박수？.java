class Solution {
    public String solution(int n) {
        String s = "수박";
        String result = "";
        
        for(int i = 0; i < n; i++){
                result += s.charAt(i % 2);
        }
            
        return result;
    }
}