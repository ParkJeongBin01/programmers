class Solution {
    public String solution(String letter) {
        // 1. a~z에 해당하는 모스부호 배열 객체.
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        // 2. 객체를 담을 builder 생성.
        StringBuilder builder = new StringBuilder(); 
        
        // 3. letter를 공백 기준으로 나누어 각 문자에 대해 처리.
        String[] letters = letter.split(" ");
        for(String code : letters){
            // 4. 인덱스를 이용하여 문자에 대해 처리
            for(int i = 0; i <= morse.length; i++){
                if(morse[i].equals(code)){
                    builder.append((char) ('a' + i));
                    break;
                }
            }
        }
            
       // 6. 최종 결과 문자열을 리턴.
        return builder.toString();     
        

    }
}