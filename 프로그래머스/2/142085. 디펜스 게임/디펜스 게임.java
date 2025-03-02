import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
//oooooooo 3번째 실행 : queue를 이용함.
        // 진행한 라운드 수를 저장할 변수 초기화
        int answer = 0;
        
        // 우선순위 큐를 생성하여 최대값이 앞에 오도록 설정
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        // 적의 공격 수를 순회하는 루프
        for(int i = 0; i < enemy.length; i++){
            // 현재 병사 수로 적의 공격을 막을 수 있는 경우
            if(n >= enemy[i]){
                n -= enemy[i]; // 병사 수에서 현재 적의 수 차감
                queue.offer(enemy[i]); // 공격받은 적의 수를 큐에 저장
                answer++; // 진행한 라운드 수 증가
            } else {
                // 현재 병사 수로 막지 못하는 경우
                // 무적권이 남아 있는 경우
                if(k > 0) {
                    // 큐에 값이 있는지 확인
                    if(!queue.isEmpty()){
                        // 큐의 가장 큰 값이 현재 적의 수보다 큰 경우
                        if(queue.peek() > enemy[i]){
                            n += queue.poll(); // 큐에서 가장 큰 값을 꺼내서 병사 수 복원
                            n -= enemy[i]; // 현재 적의 수 차감
                            queue.offer(enemy[i]); // 현재 적의 수를 큐에 추가
                        }
                    }
                    answer++; // 진행한 라운드 수 증가
                    k--; // 무적권 사용
                } else {
                    break; // 무적권이 없으면 루프 종료
                }
            }
        }
        // 최종 진행한 라운드 수 반환
        return answer;
        
        
//xxxxxxxx 2번째 실행 : 2개 문제 시간초과
//         int answer = 0;
//         int[] strongestEnemies = new int[k]; // 가장 강한 적을 저장할 배열
        
//         for (int i = 0; i < enemy.length; i++) {
//             if (k > 0) {
//                 // 우선 k번은 가장 강한 적을 넘기기 위해 배열에 저장
//                 strongestEnemies[--k] = enemy[i];
//                 Arrays.sort(strongestEnemies); // 정렬하여 가장 작은 적부터 채우기
//                 answer++;
//             } else {
//                 // 현재 적보다 이전에 넘긴 적 중 가장 약한 적이 더 크다면 교체
//                 if (strongestEnemies.length > 0 && enemy[i] > strongestEnemies[0]) {
//                     n -= strongestEnemies[0]; // 가장 약한 적을 다시 받아 처리
//                     strongestEnemies[0] = enemy[i]; // 새로운 강한 적을 추가
//                     Arrays.sort(strongestEnemies); // 정렬하여 가장 작은 값 유지
//                 } else {
//                     n -= enemy[i];
//                 }
                
//                 if (n < 0) break; // 방어력이 부족하면 종료
//                 answer++;
//             }
//         }
        
//         return answer;
//    }
//}



//xxxxxxxxx 1번째 실행 xxxxxxxx
// import java.util.*;
// class Solution {
//     public int solution(int n, int k, int[] enemy) {
//         int answer = 0; 
        
//         if(k == enemy.length) return k;
        
//         // for(int i = 0; i < enemy.length; i++){
//         //     if(enemy[i] <= n){
//         //         n -= enemy[i];
//         //         answer++;
//         //     } else {
//         //         if(k > 0){
//         //             k--;
//         //             answer++;
//         //         } else {
//         //             break;
//         //         }
//         //     }
//         // }
        
//         for(int i = 0; i < enemy.length-1; i++){
//             if(enemy[i] <= n && enemy[i] - enemy[i+1] <= 0){
//                 n -= enemy[i];
//                 answer++;
//             } else {
//                 k--;
//                 if(k < 0){
//                     return answer;
//                 }
//                 answer++;
//             }
            
//             // enemy[]을 순차적으로 생각함
//             // ex) n=5, k=2, enemy=[4,2,1,1,2]일 때 최대값 5인데
//             // 밑에 코드는 3까지 밖에 못감.
//             // if(enemy[i] <= n){
//             //     n -= enemy[i];
//             //     answer++;
//             // } else {
//             //     while(k > 0){
//             //         k--;
//             //         answer++;
//             //     }
//             //     break;
//             // }
//          }
        
//         return answer;
     }
 }