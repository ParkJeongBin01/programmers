class Solution {
    public String solution(int a, int b) {
        String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        
        for(int i = 1; i < a; i++){
            count += days[i];
        }
        count += b;
        
        return answer[(count - 1) % 7];
    }
}