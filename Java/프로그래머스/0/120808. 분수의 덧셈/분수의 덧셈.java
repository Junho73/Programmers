class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
        
        int gcd = 1; 
        for (int i = 1; i <= top && i <= bottom; i++) {
            if (top % i == 0 && bottom % i == 0) {
                gcd = i; 
            }
        }

        int[] answer = {top / gcd, bottom / gcd};
        return answer;
    }
}