class Solution {
    public int solution(int[][] lines) {
//         int answer = 0;
//         int left = 0;   // 기준이 왼쪽
//         int right = 0;  // 기준이 오른쪽
//         int mid = 0;
//         int in = 0;
        
//         for(int i = 0; i < lines.length - 1; i++){
//             for(int j = i + 1; j < lines.length; j++){
//                 if((lines[i][0] < lines[j][0] || lines[i][0] > lines[j][0]) && lines[i][1] > lines[j][0]){
                    
//                     if(lines[i][0] < lines[j][0] && lines[i][1] < lines[j][1]){
//                         left = lines[i][1] - lines[j][0];
//                         answer += left;
//                     } else if(lines[i][0] > lines[j][0] && lines[i][1] < lines[j][1]){
//                         left = lines[i][1] - lines[i][0];
//                         answer += left;
//                     } else if(lines[i][0] < lines[j][0] && lines[i][1] > lines[j][1]){
//                         left = lines[j][1] - lines[i][0];
//                         answer += left;
//                     }
                    
//                 }
//             else if(lines[i][0] < lines[j][0] && lines[i][1] > lines[j][1]){
//                     in = lines[j][1] - lines[j][0];
//                     answer += in;
//                 } 
//                 else if(lines[i][0] == lines[j][0] && lines[i][1] == lines[j][1]){
//                     mid = lines[j][1] - lines[i][0];
//                     answer += mid;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return answer;
        // 중복을 제거할 수 없음/./.... ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
        
        int answer = 0;
        
        int[] count = new int[201]; // index = 0 -> -100, inx = 200 -> 100        
        
        // 각 선분 표시
        for(int i = 0; i < lines.length; i++){
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;
            for(int x = start; x < end; x++){
                count[x]++;
            }
        }
        
        // 겹친 부분 세기(2개 이상 겹친 구간만)
        for(int x = 0; x < count.length; x++){
            if(count[x] > 1) answer++;
        }
        return answer;
    }
}