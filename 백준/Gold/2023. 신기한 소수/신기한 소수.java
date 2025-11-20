import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 자리수 입력
        int[] start = {2, 3, 5, 7};  // 첫 자리 후보

        for (int s : start) {
            dfs(s, 1, n); // 현재 숫자, 자리수, 목표 자리수
        }
    }

    // 현재 숫자 num, 현재 자리수 depth, 목표 자리수 n
    static void dfs(int num, int depth, int n) {
        if (depth == n) {
            System.out.println(num);
            return;
        }

        // 다음 자리에 1~9를 붙여보며 소수인지 체크
        for (int i = 1; i <= 9; i += 2) {  // 짝수 붙여봤자 소수 안 됨
            int next = num * 10 + i;

            if (isPrime(next)) {
                dfs(next, depth + 1, n);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
