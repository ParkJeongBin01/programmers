class Solution {
    public String solution(String cipher, int code) {
//         String answer = "";
        
//         // 입력 문자열을 문자 배열로 변환
//         String[] string = cipher.split("");
        
//         // 각 문자를 순회하며 인덱스가 code의 배수인 경우 결과에 추가
//         for(int i = 1; i < string.length; i++){
//             // 현재 인덱스가 code의 배수인지 확인
//             if((i + 1) % code == 0){
//                 answer += string[i]; // 해당 문자를 결과에 추가
//             }
//         }
//         //결과 반환
//         return answer;
//------------------------------------------------------------------------
        StringBuilder answer = new StringBuilder();
        
         // 입력 문자열을 문자 배열로 변환
         String[] string = cipher.split("");
        
        for(int i = 0; i < string.length; i++){
            if((i + 1) % code == 0){
                answer.append(string[i]); // 해당 문자를 결과에 추가
            }
        }
        
        return answer.toString();
    }
}