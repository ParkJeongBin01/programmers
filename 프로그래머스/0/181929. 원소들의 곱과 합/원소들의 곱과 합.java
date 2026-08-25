class Solution {
    public int solution(int[] num_list) {
        int A = 1;
        int B = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            A *= num_list[i];
            
            sum += num_list[i];
                if(i == num_list.length - 1){
                    B = sum * sum;
                }
        }
        
        if(A < B){
            return 1;
        } else{
            return 0;
        }
    }
}