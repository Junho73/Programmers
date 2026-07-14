class Solution {
    public int solution(int n, int k) {
        int sheepPrice = n * 12000;
        int drinkPrice = (k - (n / 10)) * 2000;
        return sheepPrice + drinkPrice;
    }
}