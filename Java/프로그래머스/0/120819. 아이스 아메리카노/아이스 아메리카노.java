class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        for (int i=1; i<=200; i++) {
            if (money < i*5500) {
               answer = new int[]{i-1, money - (5500*(i-1))};
                break;
            } 
        }
        return answer;
    }
}