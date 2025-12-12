class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one","two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        // 문자열 s 안의 영단어 숫자를 실제 숫자(0~9) 문자로 변환
        for(int i = 0; i < 10; i++){
            s = s.replace(arr[i], String.valueOf(i));
        }
                    
        // 변환된 문자열을 정수로 변환
        answer = Integer.parseInt(s);
        
        return answer;
    }
}