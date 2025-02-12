class Solution {
    public int solution(int[] sides) {
        // 1. 최대값을 담을 변수를 생성합니다.
        int max = sides[0];
        
        // 2. 배열에서 최대값을 찾습니다.
        for(int i = 0; i < sides.length; i++){
            max = Math.max(max, sides[i]);
        }

        // 3. 나머지 값들의 합과 최대값을 비교하여 결과를 리턴합니다.
        int sumOfOthers = sides[0] + sides[1] + sides[2] - max;

        // 나머지 값들의 합이 최대값보다 크면 1, 작으면 2를 리턴합니다.
        if (sumOfOthers > max) {
            return 1; // 삼각형을 만들 수 있음
        } else {
            return 2; // 삼각형을 만들 수 없음
        }
    }
}