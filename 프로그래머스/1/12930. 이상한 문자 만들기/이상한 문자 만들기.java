class Solution {
    public String solution(String s) {
        String answer = "";
        // String[] str = s.split(" ");
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(count % 2 == 0) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
            
            if(c == ' ') count = 0;
            else count++;
        }
        // for(int i = 0; i < str.length; i++){ // str배열만큼 반복. 3
        //     for(int j = 0; j < str[i].length(); j++){ // str배열 j인덱스에 해당하는 문자열을 문자로 반환.
        //         if(j % 2 == 0) answer += Character.toUpperCase(str[i].charAt(j)); // str배열 i인덱스에 해당하는 문자열 중에 j인덱스의 문자가 짝수면 대문자 입력.
        //         else answer += Character.toLowerCase(str[i].charAt(j)); // 홀수면 소문자 입력.
        //     }
        //     if(i < str.length - 1) answer += " ";
        // }
        
        return answer;
    }
}