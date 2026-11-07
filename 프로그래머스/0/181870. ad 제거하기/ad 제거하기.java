import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        
        for(int i = 0; i < strArr.length; i++){
            boolean check = false;
            for(int j = 0; j < strArr[i].length() - 1; j++){
                if(strArr[i].charAt(j) == 'a' && strArr[i].charAt(j + 1) == 'd'){ // a와 그 다음 단어가 d이면 break
                    check = true;
                    break;
                }
            }
            if(!check){
                list.add(strArr[i]);    
            }         
        }
        return list.toArray(new String[0]); 
        // list: ArrayList 객체 
        // toArray(): 배열로 변환하는 메서드
        // new String[0]: 변환할 배열의 자료형을 String으로 지정
    }
}