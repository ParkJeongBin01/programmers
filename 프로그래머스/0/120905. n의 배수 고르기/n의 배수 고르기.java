import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        //1. n의 배수에 해당하는 숫자를 찾기 위한 리스트.
        List<Integer> resultList = new ArrayList<>();
        
        //2. n의 배수를 찾기.
        for(int num : numlist){
            if(num % n == 0){
                resultList.add(num);
            }
        }

        //3. 결과를 int 배열로 반환.
        int[] result = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
         result[i] = resultList.get(i);   
        }                                      
            
        //4. 리턴    
        return result; // int[] 반환.
    }
}