class Solution {
    public int solution(int[] numbers) {  
        int maxresult = Integer.MIN_VALUE; //최댓값 초기화
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
               if(i != j){ //동일한 인덱스의 숫자는 제외
                   int result = numbers[i] * numbers[j]; // 두 수의 곱
                   maxresult = Math.max(maxresult, result); // 최댓값 업데이트
               }
            }
        }
        return maxresult;
    }
}