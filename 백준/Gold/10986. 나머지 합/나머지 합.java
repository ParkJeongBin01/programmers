import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        
        long[] S = new long[N]; // 배열 합 생성.
        long[] C = new long[M]; // 나머지 개수 저장.
        long answer = 0;
        
        
        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        
        
        for(int i = 1; i < N; i++){ // 배열 합 값 적용.
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N; i++){
            int remainder = (int)(S[i] % M);
            if(remainder == 0) answer++;
            C[remainder]++;
        }
        
        for(int i = 0; i < M; i++){
            if(C[i] > 1){
                answer = answer + (C[i] * (C[i]-1) / 2);
            }
        }
        
        System.out.print(answer);
    }
}