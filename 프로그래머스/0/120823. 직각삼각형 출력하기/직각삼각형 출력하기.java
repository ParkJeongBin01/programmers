import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Scanner 객체 생성.
        int n = scanner.nextInt();                  //정수 n을 입력받음.  
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();                   // 다음 줄로 이동
        }
    }
}