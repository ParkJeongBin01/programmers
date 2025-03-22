import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0; // 현재 좌표
        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // U, D, R, L 이동
        Map<Character, Integer> dirMap = Map.of('U', 0, 'D', 1, 'R', 2, 'L', 3);

        for (char dir : dirs.toCharArray()) {
            int d = dirMap.get(dir);
            int nx = x + move[d][0];
            int ny = y + move[d][1];

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue; // 좌표 제한 (-5 ~ 5)
            
            String path1 = x + "" + y + "" + nx + "" + ny; // 현재 → 다음 좌표
            String path2 = nx + "" + ny + "" + x + "" + y; // 다음 → 현재 좌표 (반대 방향)

            if (!visited.contains(path1)) {
                visited.add(path1);
                visited.add(path2);
            }
            
            x = nx;
            y = ny;
        }
        
        return visited.size() / 2; // 양방향 저장했으므로 2로 나눔
    }
}
