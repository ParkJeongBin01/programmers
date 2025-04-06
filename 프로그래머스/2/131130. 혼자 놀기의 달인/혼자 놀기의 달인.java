import java.util.*;

class Solution {
    public int solution(int[] cards) {
        //03.31 1문제 맞음 ㅠ
      //  HashMap<Integer, Integer> map = new HashMap<>();
      //  List<Integer> mapsize = new ArrayList<>();
        
      //  for(int i = 0; i < cards.length; i++){ // 시작 인덱스
        //    if(map.containsKey(cards[i])) continue; // 이미 방문한 경우 건너뜀.
            
         //   int index = i; // 현재 위치 설정
     //   while(!map.containsKey(cards[index])){ // 방문한 숫자가 나오면 중단
            //    map.put(cards[index],map.getOrDefault(cards[index],0)+1);
             //   index = cards[index]-1; // 다음 이동
            
      //  }
        //    if(map.size() < 2) break;
        //    mapsize.add(map.size());
         //   map.clear();
     //   }
        
      //  if(mapsize.size() < 2 ) return 0;
        
    //    mapsize.sort(Collections.reverseOrder());
            
            
     //   return mapsize.get(0) * mapsize.get(1);
        
    boolean[] visited = new boolean[cards.length];
    List<Integer> size = new ArrayList<>();
        
    for(int i = 0; i < cards.length; i++){
        int index = i;
        int count = 0;
        while(!visited[index]){
            visited[index] = true;
            index = cards[index] - 1;
            count++;
        }
        size.add(count);
    }
        if(size.size() < 2) return 0;
       // size.sort(Collections.reverseOder());
       size.sort(Collections.reverseOrder());
        
        return size.get(0) * size.get(1);
        
    }
}