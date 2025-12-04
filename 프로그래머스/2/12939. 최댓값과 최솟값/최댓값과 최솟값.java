class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String[] arr = s.split(" ");  // ✅ 공백 기준 분리

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);  // ✅ 문자열 → 숫자 변환

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max;
    }
}
