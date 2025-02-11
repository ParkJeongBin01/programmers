class Solution {
    public int solution(int balls, int share) {
    if(share == balls) return 1; // 모든 공을 선택하는 경우.
    
    long answer = 1;
    for(int i = 0; i < share; i++){
        answer *= (balls - i);
        answer /= (i + 1);
    }
    return (int)answer;
    }
}