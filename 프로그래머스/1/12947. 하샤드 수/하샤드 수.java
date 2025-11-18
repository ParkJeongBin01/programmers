class Solution {
    public boolean solution(int x) {
        
        int original = x;
        int digit = 0;
        int result = 0;
        while (x > 0) {
            digit = x % 10;
            x /= 10;
            result += digit;
        }
        
        return original % result == 0 ? true : false;
        
            
    }
}