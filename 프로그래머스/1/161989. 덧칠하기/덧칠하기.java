class Solution {
    public int solution(int n, int m, int[] section) {
        //    n    : 벽의 길이.
        //    m    : 룰러의 길이.
        // section : 칠해야 할 구역.
        
        int answer = 0; // 룰러를 사용한 횟수.
        int sections = 0; // 마지막으로 칠한 구역의 끝 위치.
        
        for(int i = 0; i < section.length; i++){
            if(sections < section[i]){ // 현재 칠해야 할 구역이 이미 칠해져있는지 확인.
            sections = section[i]  + m -1; // 현재 구역이 칠해지지 않았으면, 이 지점을 시작으로 m만큼 칠함. 
            //-1을 한 이유는 해당 구역부터 세야하기 때문(ex. 해당 구역 2, 룰러 길이 4면 2,3,4,5를 칠해야함, -1을 안 하면 3,4,5,6이 되어버림).
            answer++; // 룰러 한 번 사용.
            } 
        }
        return answer; // 사용한 룰러 횟수. 
    }
}