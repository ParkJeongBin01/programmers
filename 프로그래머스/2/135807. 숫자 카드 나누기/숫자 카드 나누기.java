class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayGCD(arrayA);
        int gcdB = arrayGCD(arrayB);

        int answer = 0;

        // gcdA가 arrayB의 원소 어떤 것도 나눌 수 없어야 함
        if (!canDivide(arrayB, gcdA)) {
            answer = Math.max(answer, gcdA);
        }

        // gcdB가 arrayA의 원소 어떤 것도 나눌 수 없어야 함
        if (!canDivide(arrayA, gcdB)) {
            answer = Math.max(answer, gcdB);
        }

        return answer;
    }

    // 배열 전체의 GCD 구하기
    private int arrayGCD(int[] arr) {
        int g = arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g, arr[i]);
        }
        return g;
    }

    // 최대공약수 구하기
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    // divisor로 arr의 어떤 원소도 나눌 수 없어야 true
    private boolean canDivide(int[] arr, int divisor) {
        for (int num : arr) {
            if (num % divisor == 0) return true;  // 하나라도 나누어지면 실패
        }
        return false;  // 아무것도 나누지 못해야 성공
    }
}
