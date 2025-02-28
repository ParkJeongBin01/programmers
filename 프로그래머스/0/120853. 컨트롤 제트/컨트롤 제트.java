import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0; // 최종 결과를 저장할 변수 초기화

        ArrayList<String> list = new ArrayList<>(); // 문자열을 저장할 리스트 생성
        
        String[] numbers = s.split(" "); // 입력 문자열을 공백을 기준으로 나누어 배열로 저장
        
        // 배열에 있는 숫자를 리스트에 추가
        for(String number : numbers){
            list.add(number); // 각 숫자를 리스트에 추가
        }
        
        // 리스트를 순회하면서 계산 수행
        for(int i = 0; i < list.size(); i++){
            // 현재 요소가 "Z"인 경우
            if(list.get(i).equals("Z")){
               // "Z"가 발견되면 이전 숫자를 제거
               if(i > 0){ // 이전 숫자가 존재하는 경우
                   answer -= Integer.parseInt(list.get(i-1)); // 이전 숫자를 answer에서 차감
               } 
            } else {
                // 일반 숫자인 경우 answer에 더함
                answer += Integer.parseInt(list.get(i)); // 현재 숫자를 answer에 더함
            }
        }
        
        return answer; // 최종 계산 결과 반환
    }
}
