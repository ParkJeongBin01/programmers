class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            answer += aycsu(i);
        }
        
        return answer;
    }
    
    public static int aycsu(int a){ // a = left
        int count = 0;
        for(int i = 1; i <= a; i++){ // 시간 신경 안 쓰고 하기.
            if(a % i == 0){
                count++;
            }
        }
        return (count % 2 == 0) ? a : -a; //count(약수의 개수)가 짝수면 +, 홀수면 -
    }
}



// -------------------완전 제곱수 풀이------------------------------

// class Solution {
//     public int solution(int left, int right) {
//         int answer = 0;
        
//         for(int i = left; i <= right; i++){
//             int sqrt = (int)Math.sqrt(i);
            
//             if(sqrt * sqrt == i){
//                 answer -= i;
//             } else {
//                 answer += i;
//             }
//         }
        
//         return answer;
//     }
// }