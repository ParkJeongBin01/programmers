class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int count = 0;
        int band = 1;
        
        for(int i = 0; i <= attacks[attacks.length - 1][0]; i++){
            if(count < attacks.length && attacks[count][0] == i){ // 공격을 받으면
                answer -= attacks[count++][1]; // 현재 체력이 공격 받은 데이미만큼 깍임.
                if(answer <= 0) return -1; // 현재 체력이 0이 되면 -1
                band = 1; // band(연속 성공은 다시 1)
            } else {
                if(band < bandage[0]){ // 연속 공격 성공
                    answer += bandage[1]; // 현재 체력을 초당 회복량만큼 회복시킴.
                    band++; // 연속 성공하였으므로 +1
                    if(answer >= health) answer = health; // 최대 체력 이상 체력을 가질 수 없다.(체력 상한 처리)
                } else if(band == bandage[0]){ // 연속 성공이 추가 회복량만큼 성공
                    answer += (bandage[1] + bandage[2]); // 현재 체력을 초당 회복량 + 추가 회복량만큼 회복
                    band = 1; // 연속 성공을 위해 다시 1.
                    if(answer >= health) answer = health; // 최대 체력 이상 체력을 가질 수 없다.(체력 상한 처리)
                }
            }
        }
        
        return answer;
    }
}