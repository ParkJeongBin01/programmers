import java.util.*;
class Solution {
    public int solution(int[] nums) { // [3,2,1,3]
        // HashMap map을 선언. 키는 숫자, 값은 해당 숫자의 등장 횟수
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 순회.
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1); //현재 숫자 num이 map에 없으면 0을 반환하고 그 값에 1을 증가 시켜 map에 저장. 
        } //최종적으로 {3=2, 2=1, 1=1}이 된다.
        
        int poncket = nums.length / 2; // nums 배열을 2로 나눔. 2가됨.
        if(poncket <= map.size()){  // 중복되지 않은 숫자의 개수(map.size() = 3)가 poncket보다 크거나 같으면 poncket반환.
            return poncket;
        } else{
            return map.size(); // 아니라면 중복되지 않은 숫자의 개수(map.size())가 반환.
        }         
    }
}