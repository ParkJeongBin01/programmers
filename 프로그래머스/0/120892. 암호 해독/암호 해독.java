class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // 공백 포함 배열로 바꾼다.
        String[] string = cipher.split("");
        
        // string length만큼 반복.
        for(int i = 1; i < string.length+1; i++){
            //code의 배수와 같으면 answer에 추가.
            if(i % code == 0){
                answer += string[i-1];
            }
        }
        
        return answer;
    }
}