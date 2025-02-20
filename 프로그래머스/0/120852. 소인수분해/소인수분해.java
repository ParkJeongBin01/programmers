import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
    ArrayList<Integer> list = new ArrayList<>();
        //2부터 제곱근까지
        //제곱근으로 계산하는 이유
        //소인수는 항상 쌍이 있음.
        //n의 소인수가 ( \sqrt{n} )보다 크다면, 그 짝인 소인수는 ( \sqrt{n} )보다 작아야 한다.
        //n = 36  경우 : 소인수는 ( 1, 2, 3, 4, 6, 9, 12, 18, 36 )이다.
        //제곱근인 ( 6 )을 기준으로 나누어 보면, ( 2 \times 18, 3 \times 12, 4 \times 9 )와 같은 쌍을 확인할 수 있다.
        //결론적으로, 제곱근까지 확인함으로써 모든 소인수를 효율적으로 찾을 수 있으며, 중복된 계산을 피할 수 있음..
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        if(n > 1){
            list.add(n);
        }
        
        //배열로 변환.
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
