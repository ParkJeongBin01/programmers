class Solution {
    public String solution(String phone_number) {
        // 전화번호의 길이를 구합니다.
        int length = phone_number.length();
        
        // 마지막 4자리를 제외한 나머지 부분을 '*'로 대체합니다.
        String answer = "*".repeat(length - 4) + phone_number.substring(length - 4);
        
        return answer;
    }
}
