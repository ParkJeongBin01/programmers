class Solution {
    public int solution(int[] numbers, int k) {
        //1.k번째로 공을 던지는 사람의 번호
        int number = 0;
        
        //2.k번째 공을 던지는 사람 계산
        for(int i = 0; i < k-1; i++){
            number = (number + 2) % numbers.length ;  
        }
        
        //3. k번째로 공을 던지는 사람의 번호 반환
        return numbers[number];
    }
}