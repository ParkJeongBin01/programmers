class Solution {
    public int solution(String[] babbling) {
        // String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        // 할 수 있는 발음 : "aya", "ye", "woo", "ma"
        
        int answer = 0;
        
        String[] can = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling){
            String word = b;
            boolean ok = false;
            
            for(String c : can){
                if(word.contains(c + c)){
                    ok = true;
                    break;
                }
            }
            if(ok) continue; // 불가능한 단어는 건너뜀
            
            for(String c : can){
                word = word.replace(c," "); // 가능한 발음을 " "로 치환
            }
            word = word.replace(" ",""); // 남은 공백 제거
            
            if(word.equals("")){
                answer++; //발음 가능한 단어
            }
            // 38번 줄 말고 아래 코드도 가능.
            //  if (word.trim().isEmpty()) {
            //     answer++;
            // }
        }
        return answer;
    }
}