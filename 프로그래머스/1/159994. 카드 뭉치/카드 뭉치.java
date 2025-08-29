class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int inx1 = 0; //cards1의 인덱스(현재 위치)를 inx1로 저장하는 변수.
        int inx2 = 0; //cards2의 인덱스(현재 위치)를 inx2로 저장하는 변수.
    
        for(int i = 0; i < goal.length; i++){ //goal 배열을 하나씩 순서대로 탐색함.
            if(inx1 < cards1.length && goal[i].equals(cards1[inx1])){ // cards1 길이보다 작고 goal[i]와 cards1의 현재위치와 같은지 확인.
                inx1 += 1; // goal[i]와 cards1의 현재위치가 같으면 inx1이 1증가함.
            } else if(inx2 < cards2.length && goal[i].equals(cards2[inx2])){ // cards2 길이보다 작고 goal[i]와 cards2의 현재위치와 같은지 확인.
                inx2 += 1; // goal[i]와 cards2의 현재위치가 같으면 inx2이 1증가함.
            } else{
                return "No"; // 순서가 맞지 않으면 "No"를 반환.
            }
       }
        return "Yes";
    }
}