import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int count = 0;
        
        // 상대 패와 나의 패를 오름차순으로 정렬.
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 나의 패 중 가장 높은 카드
        int Bindex = B.length - 1;
        
        // 상대 패에서 가장 높은 카드부터 
        for(int i = A.length - 1; i >= 0; i--){
            if(A[i] < B[Bindex]){ // 나의 패 중 가장 높은 카드로 상대방을 
                count++;
                Bindex--;
            }
            // else: 상대 카드가 너무 강해 못 이기는 경우
            // -> Bindex를 줄이지 않고 가만히 둠으로써 나의 가장 높은 카드는 온전히 아끼고,
            //    결과적으로 루프 종료 시 맨 앞의 최약체 카드(크리보)를 제물로 버린 셈이 됨.
        }
        
        
        return count;
    }
}