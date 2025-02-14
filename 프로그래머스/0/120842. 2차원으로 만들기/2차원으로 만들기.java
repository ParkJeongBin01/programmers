class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 1. 저장할 2차원 배열 초기화
        int[][] answer = new int[num_list.length / n][n];
        
        // 2. 1차원 배열을 순회하며 2차원 배열에 값 할당
        for(int i = 0; i < num_list.length; i++){
            answer[i / n][i % n] = num_list[i]; // 2치원 배열에 값 넣기
        }
        
        // 3. 결과 반환.
        return answer;
    }
}