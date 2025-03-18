import java.util.*;

class Solution {
    // 메인 솔루션 함수
    public int solution(int[] numbers, int target) {
        // dfs를 호출하여 결과를 반환
        return dfs(numbers, 0, target, 0);
    }

    // dfs (깊이 우선 탐색) 함수
    private int dfs(int[] numbers, int index, int target, int sum) {
        // 배열의 모든 숫자를 처리했을 때, 목표 값인 target과 현재 sum을 비교
        if (index == numbers.length) {
            // 현재 sum이 target과 같으면 1을 반환 (성공)
            // 아니면 0을 반환 (실패)
            return (sum == target) ? 1 : 0;
        }

        int count = 0;  // 목표 값이 되는 방법의 수를 저장할 변수

        // 현재 숫자를 더한 경우에 대해 dfs 호출
        count += dfs(numbers, index + 1, target, sum + numbers[index]);
        // 현재 숫자를 뺀 경우에 대해 dfs 호출
        count += dfs(numbers, index + 1, target, sum - numbers[index]);

        // 두 가지 경우의 수를 합산해서 반환
        return count;
    }
}
