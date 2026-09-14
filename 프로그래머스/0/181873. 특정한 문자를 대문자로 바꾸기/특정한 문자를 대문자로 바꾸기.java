class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        // for(int i = 0; i < my_string.length(); i++){        // my_string 길이만큼 반복.
        //     if(my_string.charAt(i) == alp.charAt(0)){       // my_string(i)와 alp를 비교해서 맞다면
        //         answer += Character.toUpperCase(my_string.charAt(i)); // answer에 my_string에 해당하는 문자를 대문자로 변환해서 넣는다. char형이기에 Character 클래스의 메서드를 사용함.
        //     } else {
        //         answer += my_string.charAt(i);              // 맞지 않다면 answer에 그대로 넣어줌.
        //     }
        // }
        
        for(char c : my_string.toCharArray()){// my_string(String 형)을 char배열로 만든 걸 순차적으로 c로 넣음.
            if(c == alp.charAt(0)){           // c와 alp을 비교해서 맞는다면 
                answer += Character.toUpperCase(c);             // 대문자로 바꿔 answer에 넣어준다.
            } else{                             // 아니라면
                answer += c;                    // c를 그대로 넣어준다.
            }
        }
        
        return answer;
    }
}