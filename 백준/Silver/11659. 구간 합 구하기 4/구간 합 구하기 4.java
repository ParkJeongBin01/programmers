import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int m = sc.nextInt(); // 3
        int[] A = new int[n];
        int[] S = new int[n+1];
        
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt(); // 5 4 3 2 1
        }
        
        for(int i = 1; i < S.length; i++){
            S[i] = S[i-1] + A[i-1];
        }
            
        for(int i = 0; i < m; i++){
            int start = sc.nextInt(); // 1 2 5
            int end = sc.nextInt(); // 3 4 5
            System.out.println(S[end] - S[start-1]);
        }
    }
}