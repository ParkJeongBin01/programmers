import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // 첫 번째 방법
        // 1. 내림차순으로 정렬.
        // 2. 버블정렬로 n보다 가까운 수 찾기
        // 두 번째 방법
        // 1. 버블정렬로 n보다 가까운 수 찾기
        // 2. 가까운 수의 거리가 같다면 더 큰 값을 정렬.

        // 첫 번째 방법
//         Integer[] result = Arrays.stream(numlist).boxed().distinct().toArray(Integer[]::new); // 문제에 중복이 없다는 걸 알려줬기에 distinct()는 필요없음.
//         Arrays.sort(result, Collections.reverseOrder());
        
//         for(int i = 0; i < result.length - 1; i++){
//             for(int j = i + 1; j < result.length; j++){
//                 int n1 = Math.abs(n - result[i]);
//                 int n2 = Math.abs(n - result[j]);
//                 if(n1 > n2){
//                     int temp = result[j];
//                     result[j] = result[i];
//                     result[i] = temp;
//                 }
//             }
//         }
        
//         // Integer[] → int[]
//         return Arrays.stream(result)
//                      .mapToInt(Integer::intValue)
//                      .toArray();
        
        // 두 번째 방법
        for(int i = 0; i < numlist.length - 1; i++){
            for(int j = i + 1; j < numlist.length; j++){
                int n1 = Math.abs(n - numlist[i]);
                int n2 = Math.abs(n - numlist[j]);
                if(n1 > n2 || (n1 == n2 && numlist[i] < numlist[j])){
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }
        
        return numlist;
    }
}