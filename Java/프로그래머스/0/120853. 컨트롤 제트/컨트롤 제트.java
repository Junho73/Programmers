class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] tokens = s.split(" ");
        int lastNum = 0;
        for (String token : tokens) {
            if (token.equals("Z")) {
                answer -= lastNum;
            } 
            else {
                int currentNum = Integer.parseInt(token);
                answer += currentNum;
                lastNum = currentNum;
            }
        }
        return answer;
    }
}