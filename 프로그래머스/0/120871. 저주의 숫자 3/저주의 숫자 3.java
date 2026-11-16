class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i < n; i++){

            while(true){
                answer++;

                String s = String.valueOf(answer);
                if(answer % 3 != 0 && !s.contains("3")) break;
            }
        }

        return answer;
    }
}