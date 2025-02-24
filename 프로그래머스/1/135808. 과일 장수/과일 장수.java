import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        //점수 배열을 오름차순으로 정렬
        Arrays.sort(score);
        
        int length = score.length;
        int index = 0;
        int[] price = new int[m];
        
        //점수 배열의 길이가 m보다 작으면 0을 반환
        if(length - 1 < m){
            return 0;
        }
        
        //점수 묶음을 처리
        for(int i = length-1; i >= 0; i--){     
            price[index] = score[i];
            index++;   
            
            if(index == m){
               answer += (price[m-1] * m); 
                index = 0;
                
            }
        }
        
        
        return answer;
    }
}