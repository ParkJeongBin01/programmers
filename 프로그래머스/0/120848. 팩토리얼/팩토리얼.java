import java.util.*;
class Solution {
    public int solution(int n) { 
        return factorial(n);
    }
    //factorial 메서드 
    static int factorial(int m){
        //result변수 초기화
        int result = 1;
        //m크기만큼 반복
        for(int i = 1; i <= m; i++){
            result *= i;
            //result가 m보다 커지면 반복을 멈추고 결과 반환.
            if(result > m){
                return i-1;
                } else if(result == m){ //result == m이면 i를 반환. ex) 24 == 24면 4반환.
                    return i;
                }
            }
            return result;
        }    
    }