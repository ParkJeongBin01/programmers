import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        // 1️⃣ int → String 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 2️⃣ 핵심 정렬 로직
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 3️⃣ "0"만 있는 경우 처리
        if (arr[0].equals("0")) return "0";

        // 4️⃣ 이어 붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
