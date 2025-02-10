class Solution {
    public String solution(String rsp) {
        //1. StringBuilder 객체 생성
        StringBuilder answer = new StringBuilder();
        
        //2. rsp 문자열을 문자 배열로 변환하여 반복
        for(char rspp : rsp.toCharArray()){
            //3. 문자로 비교하여 변환
            if(rspp == '0'){
                answer.append('5');
            } else if(rspp == '2'){
                answer.append('0');
            } else{
                answer.append('2');
            }
        }
        
        //4. 변환된 결과 반환
        return answer.toString();
    }
}