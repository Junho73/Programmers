class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("left")) {
                answer[(i - 1 + numbers.length) % numbers.length] = numbers[i]; 
            }
            else if (direction.equals("right")) {
                answer[(i + 1) % numbers.length] = numbers[i];
            }
        }
        return answer;
    }
}