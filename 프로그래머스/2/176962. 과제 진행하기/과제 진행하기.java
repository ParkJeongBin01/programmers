// 예시 : plans = [["A","12:00","30"],["B","12:10","20"],["C","12:50","10"]]
import java.util.*;
class Solution {
    // 👇 멈춘 과제를 저장할 클래스(Solution 안에 선언)
    static class Task {
        String name; // 과제 이름
        int remain;  // 남은 시간

        Task(String name, int remain) {
            this.name = name;
            this.remain = remain;
        }
    }
    public String[] solution(String[][] plans) {
        int[][] timeIndex = new int[plans.length][2]; // [시작시간(분), plans 인덱스]
        String[] answer = new String[plans.length]; // 수행 완료 순서
        int idx = 0;
        
        // 1. 시작 시간을 분 단위로 변환
        for(int i = 0; i < plans.length; i++){
            String[] s = plans[i][1].split(":");
            
            int hour = Integer.parseInt(s[0]);   // split으로 나눈 문자열 "시"를 숫자로 바꿈
            int minute = Integer.parseInt(s[1]); // split으로 나눈 문자열 "분"을 숫자로 바꿈
            
            timeIndex[i][0] = hour * 60 + minute; // 시작 시간(분)
            timeIndex[i][1] = i;                  // plans의 원래 인덱스
        }
        
        // 2. 시작 시간 기준으로 정렬
        Arrays.sort(timeIndex, (a, b) -> a[0] - b[0]); // 시작 시간이 가장 빠른 과제들 정렬.
        
        Stack<Task> stack = new Stack<>();  // 잠시 멈춘 과제
        
        // 3. 과제 진행
        for(int i = 0; i < plans.length - 1; i++){
            int time = timeIndex[i][0];  // 현재 과제 시작 시간 i=0:720, i=1:730, i=2:770
            int pname = timeIndex[i][1]; // 현재 과제의 plans 인덱스 i=0:0, i=1:1, i=2:2
            int play = Integer.parseInt(plans[pname][2]); // 소요 시간 i=0:30, i=1:20, i=2:10
            
            int nexttime = timeIndex[i + 1][0]; // 다음 과제 시작 시간 i=0:730, i=1:770
            int endtime = time + play;          // 현재 과제 종료 예정 시간 i=0:750, i=1:750, i=2:780
            
            // 다음 과제 시작 전에 끝내지 못한 경우 -> 멈춤
            if(endtime > nexttime){ // 진행 중인 과제가 멈춤.
                stack.push(new Task(plans[pname][0], endtime - nexttime)); // i=0:stack=[0, 750 - 730 = 20]
            }
            // 현재 과제를 끝낼 수 있는 경우
            else {
                answer[idx++] = plans[pname][0];
                int freetime = nexttime - endtime; // 남는 시간 i=1:770 - 750 = 20
                
                // 남는 시간 동안 멈춘 과제 제개
                while(freetime > 0 && !stack.isEmpty()){ // 20 > 0 && true
                    Task t = stack.peek();
                    
                    // 멈춘 과제를 전부 끝낼 수 있는 경우
                    if(t.remain <= freetime){ // i=1:20 <= 20
                        freetime -= t.remain; 
                        answer[idx++] = t.name;
                        stack.pop();
                    } 
                    // 일부만 진행 가능한 경우
                    else {
                        t.remain -= freetime;
                        freetime = 0;
                    }
                }
            }
        }
        
        // 4. 마지막 과제는 무조건 완료
        answer[idx++] = plans[timeIndex[plans.length - 1][1]][0];
        
        // 5. 남은 stack 처리
        while (!stack.isEmpty()) {
            answer[idx++] = stack.pop().name;
        }
        
        
        return answer;
    }   
}