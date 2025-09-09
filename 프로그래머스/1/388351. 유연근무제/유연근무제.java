class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        // [700, 800, 1100]
        // [[710, 2359, 1050, 700, 650, 631, 659], [800, 801, 805, 800, 759, 810, 809], [1105, 1001, 1002, 600, 1059, 1001, 1100]]
        // startday = 5
        int answer = 0; // 상품을 받을 직원.
        int swap = 0;   // 출근 인정 시간 변수.
        startday--;     // startday를 0~6로 맞춤 (0=월요일, 6=일요일)
        
        for(int i = 0; i < schedules.length; i++){
            boolean ok = true; // 출근 시간이 늦으면 false되게끔 선언.
                if(schedules[i] % 100 >= 50){   // 50분 ~ 59분일 때
                swap = schedules[i] + 50;        
                } else {                        // 0분 ~ 49분일 때
                swap = schedules[i] + 10;       // 출근 희망 시각
                }
                // int swap = (schedules[i] % 100 >= 50) ? schedules[i] + 50 : schedules[i] + 10; 이렇게 가능.
            
            for(int j = 0; j < timelogs[i].length; j++){ 
                 int day = (startday + j) % 7; // 0~6 요일 계산

                // 주말이면 건너뛰기 (토=5, 일=6)
                if (day == 5 || day == 6) {
                    continue; // 주말이면 19번 줄로 이동.
                }
                
                // 출근 인정 시각보다 크면 늦은 거기 때문에 ok = false로 바뀌고 for문 끝남.
                if(swap < timelogs[i][j]){
                    ok = false;
                    break;
                }
            }
            if(ok){ // 일주일 동안 늦지 않고 출근 했으면 상품 받을 직원 + 1
                    answer++;
            }
        }
        return answer;
    }
}