class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 5, 3, 1의 몫을 한 번에 계산
        answer += hp / 5; // 5로 나눈 몫을 answer에 더함
        hp %= 5; // 나머지를 hp에 저장

        answer += hp / 3; // 3으로 나눈 몫을 answer에 더함
        hp %= 3; // 나머지를 hp에 저장

        answer += hp; // 1로 나눈 몫은 hp 자체가 됨 (hp가 1 이하일 경우)
         return answer;
    }
}