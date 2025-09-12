class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;
        
        for(char c : s.toCharArray()){
            if(c == 'p' || c == 'P'){
                count1++;
            }
            if(c == 'y' || c == 'Y'){
                count2++;
            }
        }
        
        if(count1 == count2){
            answer = true;
        } else{
            answer = false;
        }

        return answer;
    }
}