class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = String.valueOf(age);
        for (int i = 0; i < ageStr.length(); i++) {
            char digitChar = ageStr.charAt(i);
            int digitNum = digitChar - '0';
            char targetAlphabet = (char) (digitNum + 'a');
            sb.append(targetAlphabet);
        }
        return sb.toString();
    }
}