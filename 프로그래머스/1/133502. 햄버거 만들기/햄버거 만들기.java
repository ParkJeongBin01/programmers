import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int n : ingredient) {
            stack.push(n);

            // 스택의 크기가 4 이상일 때 확인
            if (stack.size() >= 4) {
                // 최근 4개의 요소가 [1, 2, 3, 1]인지 확인
                if (stack.get(stack.size() - 1) == 1 &&
                    stack.get(stack.size() - 2) == 3 &&
                    stack.get(stack.size() - 3) == 2 &&
                    stack.get(stack.size() - 4) == 1) {
                    answer++; // 조합을 찾았으므로 카운트 증가
                    // 조합을 찾았으므로 4개 요소 제거
                    stack.pop(); // 1
                    stack.pop(); // 3
                    stack.pop(); // 2
                    stack.pop(); // 1
                }
            }
        }

        return answer;
    }
}