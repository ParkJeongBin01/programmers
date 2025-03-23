import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int totalPicks = picks[0] + picks[1] + picks[2]; // 전체 곡괭이 개수
        int groupCount = (int) Math.ceil(minerals.length / 5.0); // 5개씩 그룹 나누기

        // 그룹이 곡괭이 개수보다 많으면 곡괭이 개수만큼만 사용
        groupCount = Math.min(groupCount, totalPicks);

        // 1. 그룹별 다이아/철/돌 개수 세기
        List<int[]> groups = new ArrayList<>();
        for (int i = 0; i < groupCount; i++) {
            int diamondCount = 0, ironCount = 0, stoneCount = 0;
            for (int j = 0; j < 5; j++) {
                int index = i * 5 + j;
                if (index >= minerals.length) break; // 광물 배열 범위 초과 방지
                if (minerals[index].equals("diamond")) diamondCount++;
                else if (minerals[index].equals("iron")) ironCount++;
                else stoneCount++;
            }
            groups.add(new int[]{diamondCount, ironCount, stoneCount});
        }

        // 2. 다이아몬드가 많은 그룹부터 내림차순 정렬
        groups.sort((a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0]; // 다이아 개수 많은 순
            if (a[1] != b[1]) return b[1] - a[1]; // 철 개수 많은 순
            return b[2] - a[2]; // 돌 개수 많은 순
        });

        // 3. 정렬된 그룹 순서대로 곡괭이 사용
        for (int[] group : groups) {
            if (picks[0] > 0) { // 다이아 곡괭이 사용
                answer += group[0] + group[1] + group[2]; // 모든 광물 1 피로도
                picks[0]--;
            } else if (picks[1] > 0) { // 철 곡괭이 사용
                answer += group[0] * 5 + group[1] + group[2]; // 다이아 5, 나머지 1
                picks[1]--;
            } else if (picks[2] > 0) { // 돌 곡괭이 사용
                answer += group[0] * 25 + group[1] * 5 + group[2]; // 다이아 25, 철 5, 돌 1
                picks[2]--;
            }
        }

        return answer;
    }
}
