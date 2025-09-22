import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 수열 길이
        int X = sc.nextInt();  // 기준 값
        
        int[] A = new int[N];  // 수열 저장 배열
        
        // 수열 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 조건에 맞는 값 출력
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
