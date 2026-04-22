import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N]; // N의 크기만큼 배열 생성.
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt(); // arr[]배열에 N의 입력값을 넣음.
        }
        
        Arrays.sort(arr); // 오름차순
        
        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }
    }
}