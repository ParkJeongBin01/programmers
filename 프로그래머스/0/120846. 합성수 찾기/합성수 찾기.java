class Solution {
    public int solution(int n) {
        //결과 저장하는 변수 생성
        int answer = 0;
        
        
        for(int i = 1; i <= n; i++){
            int number = 0;
            //합성수 체크
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    number++;
                }
            }
            if(number >= 3){
                answer++;
            }
        }
        //결과 반환
        return answer;   
    }
}