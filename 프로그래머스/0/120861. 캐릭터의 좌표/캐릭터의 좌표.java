class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int n = board[0] / 2;
        int m = board[1] / 2;
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] > -n) answer[0]--;
            } else if(keyinput[i].equals("right")){
                if(answer[0] < n) answer[0]++;
            } else if(keyinput[i].equals("up")){
                if(answer[1] < m) answer[1]++;
            } else {
                if(answer[1] > -m) answer[1]--;
            }    
        }
        
        
        return answer;
    }
}