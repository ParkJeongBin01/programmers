class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int max = arr[0];
        
        if(arr.length == 1){
            return new int[]{-1}; // 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
        }
            
        for(int i = 0; i < arr.length; i++){ // arr의 길이만큼 반복하여 가장 작은 수를 찾음.
            if(max > arr[i]){
                max = arr[i];
            }
        }
        
        int idx = 0;        // 인덱스.
        for(int num : arr){ // arr를 반복하여 num과 max(가장 작은 수)가 같지 않으면 answer에 넣는다.
            if(num != max) answer[idx++] = num;
        }
        
        return answer;
    }
}