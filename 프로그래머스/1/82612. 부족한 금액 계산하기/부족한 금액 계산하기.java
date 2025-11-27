class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
            for(int i = 1; i <= count; i++){
                int N = price * i;
                result += N;
                if(result >= money){
                    answer = money - result;
                }   
            }

        return Math.abs(answer);
    }
}