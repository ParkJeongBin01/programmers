class Solution {
    public int solution(int n) {
        int countN = Integer.bitCount(n); // n의 1 개수

        while (true) {
            n++; // n보다 큰 수부터 탐색
            // Integer.bitCount() → 2진수의 1 개수를 자동으로 세줌
            if (Integer.bitCount(n) == countN) {
                return n; // 1 개수가 같으면 리턴
            }
        }
    }
}
