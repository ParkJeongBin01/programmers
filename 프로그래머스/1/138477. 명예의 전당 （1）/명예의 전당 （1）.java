import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 최소 합 (낮은 값이 먼저 나옴)
        
        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]); // 현재 점수를 큐에 추가
            
            // k개 초과하면 가장 작은 값 제거
            if (queue.size() > k) {
                queue.poll(); // 가장 작은 값 제거 (자동 정렬)
            }
            
            // 현재 명예의 전당 최하위 점수 저장
            answer[i] = queue.peek();
        }
        
        return answer;
    }
}
