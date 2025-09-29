class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0; // mode 초기값.
        
        StringBuilder sb = new StringBuilder();
        for(char c : code.toCharArray()){
            sb.append(c);
        }
        
        for(int i = 0; i < code.length(); i++){
            char c = sb.charAt(i);
            if(mode == 0){      // mode가 0일 때 짝수 idx에 있는 문자 추가.
                if(c == '1'){   // 1을 만나면 
                    mode = 1;   // mode는 1이 됨.
                    continue;   // 다음 idx로 넘어감. ex) i = 1이면 i = 2가 됨.
                }
                if(i % 2 == 0  && c != '1'){ // 짝수일 때 추가.
                    answer.append(c);
                }
            } else if(mode == 1){ // mode가 1일 때 홀수 idx에 있는 문자 추가.
                if(c == '1'){   // 1을 만나면
                    mode = 0;   // mode는 0이 됨.
                    continue;   // 다음 idx로 넘어감.
                }
                if(i % 2 == 1 && c != '1'){ // 홀수일 때 추가.
                    answer.append(c);
                } 
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}