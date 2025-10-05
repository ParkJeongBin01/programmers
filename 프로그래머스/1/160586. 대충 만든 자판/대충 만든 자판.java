import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        //String[] keymap = {"ABACD","BCEFD"};
        //String[] targets = {"ABCD", "AABB"};
        
        //int[] answer = new int[targets.length]; // 2
        //Arrays.fill(answer, -1); // [-1, -1];
        //int min = Integer.MAX_VALUE;
        
        // i = 0일때 설명(밑에)
        // for(int i = 0; i < targets.length; i++){ // 0 < 2 targets를 기준으로 0부터
        //     int count = 0;
        //     for(int j = 0; j < targets[i].length(); j++){   // targets[0]에 있는 String을 하나씩 뺌. 
        //         char c = targets[i].charAt(j);              // 뺀 걸 c에 넣음.
        //         for(int k = 0; k < keymap[i].length(); k++){// keymap[0]에 있는 걸 탐색.
        //             if(c == keymap[i].charAt(k)){           // 뺀 c와 탐색한 게 있다면
        //                 count += k + 1;                        // count = k+1 (k+1한 이유 : 0부터 시작해서 0번째 찾으면 0이라 +1해줌)
        //                 break;                              // 찾으면 for(k)로
        //             }
        //         }
        //         answer[i] = Math.min(min,count);            // 0번째 때 가장 작게 움직인 값을 넣음.
        //     }
        // }
        
        // 위에 처럼하면 keymap[0]과 targets[0]만 비교를 함.
        // 나는 targets[0]에 있는 문자열들을 keymap[0,...]을 다 비교해서 작은 값을 추출하고 싶음.
        
        // for(int i = 0; i < targets.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < targets[i].length(); j++){
        //         char c = targets[i].charAt(j);
        //         for(int k = 0; k < keymap.length; k++){
        //             for(int o = 0; o < keymap[j].length(); o++){
        //                 if(c == keymap[j].charAt(o)){
        //                     count += o + 1;
        //                     break;
        //                 }
        //             }
        //         }
        //         answer[i] = Math.min(min,count);
        //     }
        // }
        
        // map
        Map<Character, Integer> minpress = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                int presses = i + 1;
                minpress.put(c, Math.min(minpress.getOrDefault(c, Integer.MAX_VALUE),presses));
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++){
            int count = 0;
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(!minpress.containsKey(c)){
                    count = -1;
                    break;
                }
                count += minpress.get(c);
            }
            answer[i] = count;
        }
        
        
        return answer;
    }
}