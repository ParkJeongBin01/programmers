import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        // 배열 크기를 알 수 없을 때 ArrayList 혹은 Arrays.copyOfRange()를 활용.
        
        // 1. 동적 리스트(ArrayList) 사용하기.
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){            // 왼쪽 부분 저장.
                for(int j = 0; j < i; j++){
                    list.add(str_list[j]);
                }
                break;                              // 이미 방향이 결정됐으니 종료. 
            }
            else if(str_list[i].equals("r")){       // 오른쪽 부분 저장
                for(int k = i + 1; k < str_list.length; k++){
                    list.add(str_list[k]);
                }
                break;
            }
        }
        return list.toArray(new String[0]);         // List -> String[]
        
        
        // 2. Arrays.copyOfRange() 사용하기.
        // for(int i = 0; i < str_list.length; i++){
        //     if(str_list[i].equals("l")){
        //         return Arrays.copyOfRange(str_list, 0, i);
        //     } else if(str_list[i].equals("r")){
        //         return Arrays.copyOfRange(str_list, i + 1, str_list.length);
        //     }
        // }
        // return new String[0];                       // "l"도 "r"도 없는 경우
    }
}