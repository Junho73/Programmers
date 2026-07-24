class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        String[] alphabets = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"
        };
        String[] words = letter.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (words[i].equals(morse[j])) {
                    answer += alphabets[j];
                    break;
                }
            }
        }
        return answer;
    }
}