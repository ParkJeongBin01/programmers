class Solution {
    public int solution(int[] num_list) {
        int J = 0;
        int H = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                J += num_list[i];
            } else {
                H += num_list[i];
            }
        }
        
        if(J > H){
            return J;
        } else{
            return H;
        }
        
    }
}