class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int k = 0; k < arr.length; k++){
            sum += arr[k];
        }
        // result[]을 초기화함.
        // 다른 방법도 생각해보자. 바로 초기화할 수 있는? 아님 Array 메소드를 사용?, StringBuilder을 사용할 순 없을까?
        
        int[] result = new int[sum]; // sum의 크기만큼 초기화.
        int index = 0; // 계속 더하는 역할.
        
        for(int i = 0; i < arr.length; i++){
            int count = 0; // arr[]까지만 더하는 역할.
                while(count < arr[i]){
                    result[index] = arr[i];
                    index++; // 배열이 늘어남.
                    count++; // arr[i]까지만 늘어남. i가 증가시 다시 0으로 초기화.
                }
        }
        
        
        
        return result;
    }
}