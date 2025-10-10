class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] parts = quiz[i].split(" ");
            
            int left = Integer.parseInt(parts[0]);
            String op = parts[1];
            int right = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);
            
            int calc = 0;
            if(op.equals("+")){
                calc = left + right;
            } else{
                calc = left - right;
            }
            
            if(calc == result){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}