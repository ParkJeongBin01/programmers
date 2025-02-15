class Solution {
    public String solution(String my_string) {
        //1. StringBuilder 생성
        StringBuilder string = new StringBuilder();
        
        //2. 순회하면서 대문자면 소문자로 대문자면 소문자로 변경후 추가.
        for(char c : my_string.toCharArray()){
            if(Character.isUpperCase(c)){
                string.append(Character.toLowerCase(c));
            } else{
                string.append(Character.toUpperCase(c));
            }
        }
        
        //3. 결과 반환
        return string.toString();
    }
}