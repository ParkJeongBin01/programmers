import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
            sb.append(c); 
            }
        }
        
        //문자열을 정수 배열로 변환
        String[] NumberStrings = sb.toString().split("");
        int[] answer = new int[NumberStrings.length];
        
        for(int i = 0; i < NumberStrings.length; i++){
        answer[i] = Integer.parseInt(NumberStrings[i]);
        }
        
        //Arrays.sort()오름차순으로 바꾸고 결과 반환
        Arrays.sort(answer);
        return answer;
    }
}