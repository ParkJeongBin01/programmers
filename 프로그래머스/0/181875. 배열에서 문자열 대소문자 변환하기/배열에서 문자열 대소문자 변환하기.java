class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];// strArr배열의 길이만큼 answer을 초기화.
        
        for(int i = 0; i < strArr.length; i++){     // strArr배열의 길이만큼 반복.
            if(i % 2 == 0){                         // 인덱스가 짝수인 경우
                answer[i] = strArr[i].toLowerCase();// 소문자로 변환
            } else {
                answer[i] = strArr[i].toUpperCase();// 대문자로 변환
            }
        }
        
        return answer;
    }
}