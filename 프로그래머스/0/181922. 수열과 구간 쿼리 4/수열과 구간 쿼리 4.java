class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = s; j <= e; j++){
                if(j % k == 0){ // arr[]의 값이 아닌 인덱스가 k의 배수면
                   arr[j] += 1; // 인덱스가 증가함.
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
         
        return answer;
        
    }
}