class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        // park = ["OSO","OOO","OXO","OOO"]
        // routes = ["E 2","S 3","W 1"]
        
        // 현재 위치 찾기
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    answer[0] = i; // 행
                    answer[1] = j; // 열
                    break;
                }
            }
        }
        
        // 이동 변수{N, S, W, E}
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1 ,1};
        String dirstr = "NSWE";
        
        // 이동 변수
        for(String route : routes){
            String[] part = route.split(" "); // ["E", "2"]
            String dir = part[0]; // "E"
            int dist = Integer.parseInt(part[1]); // 문자를 int로 바꿈. 2
            
            int idx = dirstr.indexOf(dir); // E는 3이기에 3에 있는 index는 dx = 0, dy = 1
            // 현재 위치를 nx, ny에 넣어줌.
            int nx = answer[0];
            int ny = answer[1];
            boolean ok = true;
                
            for(int k = 0; k < dist; k++){
                nx += dx[idx];
                ny += dy[idx];
                if(nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length()){
                    ok = false; // 범위 벗어남
                    break;
                }
                if(park[nx].charAt(ny)== 'X'){
                    ok = false; //장애물
                    break;
                }
            }    
                if(ok){
                    answer[0] = nx;
                    answer[1] = ny;
                }
        }
        return answer;
    }
}