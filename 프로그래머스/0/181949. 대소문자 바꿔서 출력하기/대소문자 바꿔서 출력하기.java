import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder answer = new StringBuilder();
        char b[] = a.toCharArray(); // 입력 문자열 char 배열로 반환
        
        for(int i = 0; i < b.length; i++){
          if(Character.isUpperCase(b[i])){ // 대문자인 경우
            answer.append(Character.toLowerCase(b[i])); // 소문자로 변환
          } else{
            answer.append(Character.toUpperCase(b[i])); // 대문자로 변환
          }
        }
        System.out.print(answer.toString());
    }
}