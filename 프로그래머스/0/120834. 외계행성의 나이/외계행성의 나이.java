class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j'};
        // 나이를 문자열로 변환
        String ageStr = String.valueOf(age);

        // 각 자리수에 해당하는 알파벳 추가
        for (char digit : ageStr.toCharArray()) {
            int index = Character.getNumericValue(digit);  // 문자로부터 정수값 얻기
            answer.append(alphabet[index]);  // 해당 알파벳 추가
        }

        return answer.toString();  // 문자열을 거꾸로 반환
//------------------------------------------------------------------------------------
//         String answer = "";  // 문자열 초기화
//         char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
//         // 나이를 문자열로 변환
//         String ageStr = String.valueOf(age);

//         // 각 자리수에 해당하는 알파벳 추가
//         for (char digit : ageStr.toCharArray()) {
//             int index = Character.getNumericValue(digit);  // 문자로부터 정수값 얻기
//             answer += alphabet[index];  // 해당 알파벳 추가
//         }

//         return answer;  // 최종 문자열 반환
    }
}