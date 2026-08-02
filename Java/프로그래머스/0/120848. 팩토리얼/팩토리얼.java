class Solution {
    public int solution(int n) {
        int i = 1;
        while (factorial(i) <= n) {
            i++;
        }
        return i - 1;
    }
    
    private int factorial(int k) {
        if (k <= 1) {
            return 1;
        }
        return k * factorial(k - 1);
    }
}