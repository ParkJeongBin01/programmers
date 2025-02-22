class Solution {
    public int solution(String t, String p) {        
        // 1. count를 세기 위한 변수 초기화
        int count = 0;
        
        // 2. p의 길이만큼 t에서 부분 문자열을 추출하여 비교
        for(int i = 0; i <= t.length() -  p.length(); i++){
            // t의 현재 인덱스 i에서 시작하여 p의 길이만큼의 부분 문자열을 추출
            String answer = t.substring(i, i + p.length());
            
            // 3. 추출한 부분 문자열이 p보다 작거나 같은지를 비교
            // compareTo 메서드는 문자열을 사전순으로 비교하여,
            // answer가 p보다 작거나 같은 경우 count를 증가시킴
            if(answer.compareTo(p) <= 0){
                count++;
            }
        }
        
        // 4. 최종 count 값을 반환
        return count;
    }
}