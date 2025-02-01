class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 객체 생성
        for(char string : my_string.toCharArray()){
            if(string != letter.charAt(0)){
                answer.append(string);
            }
        }
        return answer.toString();
    }
}