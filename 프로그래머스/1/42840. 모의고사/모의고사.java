// import java.util.*;
// class Solution {
//     public int[] solution(int[] answers) {
//         int supoja1 = 0;
//         int k1 = 1;
        
//         int supoja2 = 0;
//         int k2 = 2;
//         int[] rule = {1,3,4,5};
//         int rIndex = 0;
        
//         int supoja3 = 0;
//         int[] p3 = {3,3,1,1,2,2,4,4,5,5,};
        
//         List<Integer> list = new ArrayList<>();
        
//         for(int i = 0; i < answers.length; i++){
//             if(answers[i] == k1++){
//                 supoja1++;
//             }
//         }
//         list.add(supoja1);
        
//         for(int i = 0; i < answers.length; i++){
//             int pick;
            
//             if(i % 2 == 0){
//                 if(answers[i] == (i % k2) + 2){
//                     supoja2++;
//                 }    
//             } else{
//                 pick = rule[rIndex % 4];
//                 rIndex++;
//                 if(answers[i] == pick){
//                     supoja2++;
//                 }
//             }
//         }
//         list.add(supoja2);
        
//         for(int i = 0; i < answers.length; i++){
//             if(answers[i] == p3[i % 10]){
//                 supoja3++;
//             }
//         }
//         list.add(supoja3);
        
//         int max = Math.max(list.get(0), Math.max(list.get(1), list.get(2)));
        
//         List<Integer> result = new ArrayList<>();
        
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) == max) {
//                 result.add(i + 1); // index 0→1번, index 1→2번, index 2→3번
//             }
//         }
        
        
//         int[] answer = new int[result.size()];
//         for(int i = 0; i < result.size(); i++) {
//             answer[i] = result.get(i);
//         }
//         return answer;
//     }
// }

//-------------------------------------------------------------

import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
    
    int[] p1 = {1,2,3,4,5};
    int[] p2 = {2,1,2,3,2,4,2,5};
    int[] p3 = {3,3,1,1,2,2,4,4,5,5};
    
    int[] score = new int[3];
        
    for(int i = 0; i < answers.length; i++){
        if(answers[i] == p1[i % p1.length]) score[0]++;
        if(answers[i] == p2[i % p2.length]) score[1]++;
        if(answers[i] == p3[i % p3.length]) score[2]++;
    }
        
    int max = Math.max(score[0], Math.max(score[1], score[2]));
    
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 3; i++){
        if(score[i] == max) list.add(i + 1);
    }
        
    // List → 배열 변환
    return list.stream().mapToInt(i -> i).toArray();    
    // 96~101빼고 93번 한 줄만 넣어도 가능    
        
//     int[] answer = new int[list.size()];
//     for(int i = 0; i < list.size(); i++){
//         answer[i] = list.get(i);
//     }
    
//     return answer; 
    }
}


