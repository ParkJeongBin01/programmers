import java.util.*;

class Solution {
    public String solution(String X, String Y) { 
        int[] countX = new int[10]; // X에서 각 숫자의 개수
        int[] countY = new int[10]; // Y에서 각 숫자의 개수
        
        // X의 숫자 개수 세기
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        
        // Y의 숫자 개수 세기
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 9부터 0까지 공통 숫자를 모아 가장 큰 숫자를 만든다.
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]); // 둘 중 더 적은 개수만큼 사용 가능
            sb.append(String.valueOf(i).repeat(commonCount));
            // String.valueOf(i) i의 숫자를 문자열로 변환.
            // repeat() 문자열을 반복.
        }
        
        // 결과가 없으면 -1 반환
        if (sb.length() == 0) {
            return "-1";
        }
        
        // 결과가 0으로만 이루어졌으면 "0" 반환
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}
