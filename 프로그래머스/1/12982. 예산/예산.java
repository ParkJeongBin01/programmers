import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int c : d){
            list.add(c);
        }
        
        list.sort(Comparator.naturalOrder()); // 오름차순
        
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
            if(sum <= budget){
                answer++;
            } else{
                break;
            }
        }
        
        return answer;
    }
}