import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0; // 정답 카운트를 위한 변수 초기화
        int orderIndex = 0; // order 배열의 현재 인덱스를 추적하기 위한 변수 초기화
        
        Stack<Integer> stack = new Stack<>(); // 스택 초기화
        
        // 1부터 order.length까지 반복
        for(int i = 1; i <= order.length; i++){
            stack.push(i); // 현재 숫자를 스택에 추가
            
            // 스택의 최상단 요소가 order 배열의 현재 요소와 같으면
            // 스택에서 제거하고 정답 카운트를 증가시킴
            //isEmpty()는 스택에 요소가 없을 경우 true를 반환하고, 하나 이상의 요소가 있을 경우 false를 반환
            while(!stack.isEmpty() && order[orderIndex] == stack.peek()){
                stack.pop(); // 스택에서 최상단 요소 제거
                answer++; // 정답 카운트 증가
                orderIndex++; // order 배열의 인덱스 증가
            }
        }
        return answer; // 최종 정답 반환
    }
}