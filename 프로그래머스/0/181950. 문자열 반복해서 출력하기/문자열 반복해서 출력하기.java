import java.util.Scanner;

public class Solution {
    public static void main(String[] args) { //{'string','5'};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++){
            answer.append(str);
        }
        System.out.print(answer.toString());
    }
}