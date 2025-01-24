import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
       //반복문 사용
//        List<Integer> reverse = new ArrayList<>();
        
//         for(int i = num_list.length-1, j = 0; i >= 0; i--,j++){
//             reverse.add(num_list[i]);
//         }
//         //리스트를 배열로 반환.
//         int[] result = new int[reverse.size()];
//         for(int i = 0; i<reverse.size(); i++){
//          result[i] = reverse.get(i);
//         }
//         return result;
        
        //이게 더 쉽다!!import도 안 해줘도 됨.
//         int[] answer = new int[num_list.length];
        
//         for(int i = 0; i < num_list.length; i++){
//             answer[i] = num_list[num_list.length-i-1];
//         }
//         return answer;
        
        //Stack 활용.
        Stack<Integer> stack = new Stack<>();
        //Stack에 추가하기.
        for(int num:num_list){
            stack.push(num);
        }
        
        //역순으로 배치.
        int[] reserve = new int[num_list.length];
        
        //reserve배열에 역순으로 넣기.
        for(int i = 0; i < num_list.length; i++){
            reserve[i] = stack.pop();
        }
        return reserve;
    }
}