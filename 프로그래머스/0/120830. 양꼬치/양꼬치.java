class Solution {
    public int solution(int n, int k){
        int count = 0;
        int answer = 0;
        for(int i = 1; i <= n; i++){
            
          if(i%10==0 ){
            count++;
}
           answer = n * 12000 + k * 2000 - count * 2000; 
}
        return answer;
    }
}