class Solution {
    public int solution(int n, int w, int num) {
         /*
         [문제 상황 모델링 요약]
         - 상자 1..n이 가로로 w개씩, 위로 층을 이루며 쌓인다.
         - 1층(홀수층)은 왼→오른쪽, 2층(짝수층)은 오른→왼쪽, 3층은 다시 왼→오른쪽 … 이런 식의 ‘지그재그(뱀모양)’ 배치.
         - 상자 num을 꺼내려면:
           1) 그 상자보다 위에 있는 ‘완전히 가득 찬’ 층은 전부 치워야 하고,
           2) 맨 윗층이 덜 찬 경우에도 지그재그 정렬 때문에 내 칸이 여전히 가려지면 +1번 더 필요하다.

         [핵심 아이디어]
         - 전체 층수(= ⌈n/w⌉)와 목표 상자 층수(= ⌈num/w⌉)를 구해서
           ‘위에 있는 완전히 찬 층 수 = totalLevel - targetLevel’를 기본 횟수로 잡는다.
         - 그다음 맨 윗층의 남은 칸 수(topLocation)가 내 칸(targetLocation)을 가리면 +1을 더한다.
           (같은 방향/반대 방향일 때 가림 조건이 달라진다)
        */
        
        // 전체 층 수(= ⌈n / w⌉). 예) n=22, w=6 -> 22/6=3 나머지 있으므로 +1 해서 4층
        int totallevel = n / w; //전체 층 수
        if(n % w > 0) totallevel++; // 나머지가 있으면 층이 하나 더 필요
        
        // 목표 상자의 층(= ⌈num / w⌉). 예) num=8, w=6 -> 8/6=1 나머지 있으므로 +1 해서 2층
        int targetlevel = num / w; // 목표 상자의 층
        if(num % w > 0) targetlevel++; // 나머지가 있으면 다음 층으로 올라감
        
        if(totallevel == targetlevel) return 1; // 목표 상자가 최상층(맨 위 층)에 있으면 바로 한 번에 꺼낼 수 있음
        
        // 짝수층이면 역방향(오른→왼) 배치, 홀수층이면 정방향(왼→오른) 배치
        // 예) 4층(짝수층)=역방향, 3층(홀수층)=정방향
        boolean istopreverse = totallevel % 2 == 0; 
        boolean istagetreverse = targetlevel % 2 == 0; 
        
        /*
         targetLocation: 목표 상자가 자기 층에서 "앞쪽 기준" 몇 번째 칸인가?
         - 여기서는 먼저 num % w로 '왼쪽 기준' 위치를 구한다.
         - 단, num이 w의 배수면 % 결과가 0이므로 별도 보정이 필요하다.
           (이 코드는 "행의 진행 방향 기준(앞쪽)"을 1..w로 만들기 위해 다음과 같이 매핑한다)
             - 정방향(왼→오른) : 마지막 칸을 '앞쪽(왼쪽)에서 1번째'로 취급 → 0을 1로 보정
             - 역방향(오른→왼) : 마지막 칸을 '앞쪽(오른쪽)에서 w번째'로 취급 → 0을 w로 보정
         예) w=6, num=8 → 8%6=2 → targetLocation=2 (보정 불필요)
             w=6, num=12 → 12%6=0 → 정방향이면 1, 역방향이면 6으로 보정
        */
        
        int targetLocation = num % w; //8 % 6 = 2
        if (targetLocation == 0) {
            if(!istagetreverse) targetLocation = 1; // 정방향: 마지막 칸을 '앞쪽에서 1번째'로 본다
            else targetLocation = w;                // 역방향: 마지막 칸을 '앞쪽에서 w번째'로 본다
        }
        
        // topLocation: 최상층(전체 기준 맨 위 층)에 실제로 채워진 칸 수
        // - 0이면 꽉 찬 상태(= w칸 모두 채움)
        // - 0이 아니면 그 수만큼만 채워져 있다는 뜻
        // 예) n=22, w=6 → 22%6=4 → 최상층에 4칸만 채워져 있음
        int topLocation = n % w; //22 % 6 = 4

        /*
         가림 판정 로직
         - 기본 횟수: totallevel - targetlevel (위에 있는 '완전히 찬' 층 수)
         - 추가 +1 여부: 최상층의 남은 칸이 내 칸을 가리면 +1

         같은 방향(정/역 동일)일 때:
           - 줄이 수직으로 '정렬'되어 있다고 보면, "앞쪽부터 topLocation칸"이 가려진다고 볼 수 있다.
           - 따라서 topLocation == 0(=가득 찬 경우)거나, topLocation >= targetLocation 이면 가림 → +1

         반대 방향일 때:
           - 위아래가 대칭으로 뒤집혀 있으므로 "뒤쪽에서 topLocation칸"이 가려진다고 볼 수 있다.
           - '앞쪽에서 targetLocation'이라면 '뒤쪽에서 (w - targetLocation)'에 해당하므로,
             topLocation >= (w - targetLocation) 이면 가림 → +1
           - 코드에는 등가식으로 (topLocation == 0) || (w - topLocation <= targetLocation) 를 사용
        */
        
        if (istagetreverse == istopreverse) { // 전체층과 목표층의 진행 방향이 같을 때
            // 같은 방향: 앞쪽(topLocation칸)이 가림
            if (topLocation == 0 || topLocation >= targetLocation) {
                 // 예시 코멘트: topLocation=4, targetLocation=2 → 4 >= 2 이므로 가림 → +1
                return totallevel - targetlevel + 1;
            } else {
                return totallevel - targetlevel;
            }
        } else { // 전체층과 목표층의 진행 방향이 다를 때(한쪽 정방향, 한쪽 역방향)
            // 반대 방향: 뒤쪽(topLocation칸)이 가림 → 등가식으로 (w - topLocation) <= targetLocation 이면 가림
            if (topLocation == 0 || w - topLocation <= targetLocation) { 
                return totallevel - targetlevel + 1;
            } else {
                return totallevel - targetlevel;
            }
        }
    } 
}