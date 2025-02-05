class Solution {
    public int solution(int hp) {
//         int answer = 0;
//         // 5, 3, 1의 몫을 한 번에 계산
//         answer += hp / 5; // 5로 나눈 몫을 answer에 더함
//         hp %= 5; // 나머지를 hp에 저장

//         answer += hp / 3; // 3으로 나눈 몫을 answer에 더함
//         hp %= 3; // 나머지를 hp에 저장

//         answer += hp; // 1로 나눈 몫은 hp 자체가 됨 (hp가 1 이하일 경우)
//          return answer;
//-------------------------------------------------------------
        int[] dp = new int[hp + 1];

        // 초기 값 설정
        dp[0] = 0; // hp가 0일 때 공격 횟수는 0

        for (int i = 1; i <= hp; i++) {
            dp[i] = Integer.MAX_VALUE; // 초기화
            if (i >= 5) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            }
            if (i >= 3) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1);
            }
            dp[i] = Math.min(dp[i], dp[i - 1] + 1); // 1을 사용하는 경우
        }

        return dp[hp]; // hp에 대한 최소 공격 횟수 반환
    }
}
