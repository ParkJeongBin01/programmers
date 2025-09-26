class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[][] ok = new boolean[n][n];
        String[] String1 = new String[n];
        String[] String2 = new String[n];
        
        for(int i = 0; i < n; i++){
            String bin1 = Integer.toBinaryString(arr1[i]); // arr1[i](10진수)를 2진수로 변환.
            String1[i] = String.format("%" + n + "s", bin1).replace(' ','0'); // format["%" -> 포맷시작 + n -> 길이 + "s" -> 문자열 (포맷), bin1 (값)].replace(' ' -> 공백이면,'0' -> 0을 넣음) ex) String1 = ["01001", "10100", "11100", "10010", "01011"]; 이 됨.
        }
        
        for(int i = 0; i < n; i++){
            String bin2 = Integer.toBinaryString(arr2[i]); // arr2[i](10진수)를 2진수로 변환.
            String2[i] = String.format("%" + n + "s", bin2).replace(' ','0'); // format["%" -> 포맷시작 + n -> 길이 + "s" -> 문자열 (포맷), bin2 (값)].replace(' ' -> 공백이면,'0' -> 0을 넣음) ex) String1 = ["11110", "00001", "10101", "10001", "11100"]; 이 됨.
        }
        
        for(int i = 0; i < n; i++){
            char[] char1 = String1[i].toCharArray();
            char[] char2 = String2[i].toCharArray();    
            for(int j = 0; j < n; j++){
                if(char1[j] == '1' || char2[j] == '1'){
                    ok[i][j] = true;
                } else {
                    ok[i][j] = false;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(ok[i][j] == true){
                   sb.append("#"); 
                } else {
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}