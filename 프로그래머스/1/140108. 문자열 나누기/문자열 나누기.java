class Solution {
    public int solution(String s) {
        // 예외: 빈 문자열이면 0
        if (s == null || s.isEmpty()) return 0;

        int answer = 0;
        int balance = 0;   // 현재 조각에서 (첫 문자 개수 - 나머지 문자 개수)
        char first = 0;    // 현재 조각의 첫 문자

        for (char c : s.toCharArray()) {
            // 새 조각 시작
            if (balance == 0) {
                first = c; // 이번 조각의 기준 문자
                answer++;  // 조각 하나 시작했으니 카운트 증가
            }

            // 기준 문자면 +1, 아니면 -1
            if (c == first) balance++;
            else balance--;
        }

        return answer;
    }
}
