class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        
        
        for(int i = 0; i < picture.length; i++){StringBuilder sc = new StringBuilder();
            for(char c : picture[i].toCharArray()){
                for(int j = 0; j < k; j++){
                    sc.append(c);
                }
            }
        
            String string = sc.toString();
            for(int j = 0; j < k; j++){
                answer[i * k + j] = string;
            }
        }
        
        return answer;
    }
}