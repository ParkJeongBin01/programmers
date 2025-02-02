class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1]; // num1과 num2를 포함한 크기의 배열 생성
        for(int i = num1; i <= num2; i++){
            answer[i-num1] = numbers[i]; // numbers배열에서 num1부터 num2까지의 값을 answer에 할당
        }
        return answer; // 잘라낸 배열을 반환
   
    
    }
}