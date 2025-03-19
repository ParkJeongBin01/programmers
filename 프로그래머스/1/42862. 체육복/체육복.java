import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 체육복이 없는 학생 수
        
        // 1. 선택 절차
        // 학생 번호를 기준으로 정렬.
        Arrays.sort(lost);
        Arrays.sort(reserve);
       
        // 2. 적절성 검사
        // 체육복을 잃어버린 학생 중 여벌이 있는 학생에게 빌려줄 수 있는 경우
        // 여벌 체육복이 있는 학생이 도난당한 경우 먼저 처리
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){ // 자기 체육복을 갖고 있는 경우
                    answer++;        // 체육복을 빌려받은 학생 수 증가
                    lost[i] = -1;    // 
                    reserve[j] = -1; // 빌려준 학생은 더 이상 빌려줄 수 없도록 함.
                    break;
                }
            }
        }
                
        // 3. 해답 검사
        // 체육복을 잃어버린 학생 중 여벌이 없는 학생에게 빌려줄 수 있는 경우
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] == lost[i] -1 || reserve[j] == lost[i]+1){ 
                    answer++;       
                    reserve[j] = -1;
                    break;
                }
            }
        }
                
                
        return answer;
    }
}