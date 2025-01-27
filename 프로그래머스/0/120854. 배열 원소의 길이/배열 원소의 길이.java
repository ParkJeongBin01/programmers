class Solution {
    public int[] solution(String[] strlist) {
        int[] list = new int[strlist.length]; // 결과 배열 초기화
                                             
        for(int i = 0; i < strlist.length; i++){
            list[i] = strlist[i].length();
        }
        return list;
    }
}