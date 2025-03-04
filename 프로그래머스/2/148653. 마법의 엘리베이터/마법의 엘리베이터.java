import java.util.*;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int digit = storey % 10; // 현재 자리의 숫자
            int nextDigit = (storey / 10) % 10; // 다음 자리의 숫자
            
            if (digit > 5) {
                answer += (10 - digit); // 10에서 뺀 값을 더한다.
                storey += 10; // 반올림을 위해 다음 자리수에 +1 적용
            } else if (digit == 5) {
                if (nextDigit >= 5) { // 다음 자리가 5 이상이면 반올림
                    answer += (10 - digit);
                    storey += 10;
                } else {
                    answer += digit;
                }
            } else {
                answer += digit;
            }
            
            storey /= 10; // 한 자리 줄이기
        }
        
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int solution(int storey) {
//         int answer = 0;
//         int number = 0;
        
//         while(storey > 0){
//             answer += storey % 10;
            
//             if(answer >= 6){
//                 number = 10 - answer;
//                 storey += number;
//             } 
              
//                 storey = storey / 10; //1ㅇㅡㅣㅈㅏㄹㅣ ㅃㅐㄴ ㅊㅗㄱㅣㄱㅏㅂㅅ    
//         }
//         return answer;
//     }
// }