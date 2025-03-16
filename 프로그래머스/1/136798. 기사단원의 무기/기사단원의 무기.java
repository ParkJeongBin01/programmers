import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0; // 최종 결과를 저장할 변수 초기화

         // 1부터 number까지 반복하며 각 숫자에 대해 약수의 개수를 구함
        for (int i = 1; i <= number; i++) {
            int count = 0; // 각 숫자 i에 대한 약수의 개수를 저장할 변수 초기화

            // i의 약수 개수를 구하는 반복문
            for (int j = 1; j * j <= i; j++) { // 1부터 sqrt(i)까지 반복
                if (i % j == 0) {
                    count++;  // j가 약수일 때
                    if (j != i / j) {
                        count++;  // i / j가 다른 약수일 때
                    }
                }
            }

            // 약수 개수가 limit을 초과하면 power로 설정
            if (count > limit) {
                count = power;
            }
            // 각 숫자 i에 대해 구한 약수 개수를 최종 결과에 더함
            answer += count;
        }

        return answer; // 최종 결과 리턴
    }
}