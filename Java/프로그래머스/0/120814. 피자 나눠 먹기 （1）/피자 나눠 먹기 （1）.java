class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n <= 7)
            answer = 1;
        else if (7 < n && n <= 14)
            answer = 2;
        else if (14 < n && n <= 21)
            answer = 3;
        else if (21 < n && n <= 28)
            answer = 4;
        else if (28 < n && n <= 35)
            answer = 5;
        else if (35 < n && n <= 42)
            answer = 6;
        else if (42 < n && n <= 49)
            answer = 7;
        else if (49 < n && n <= 56)
            answer = 8;
        else if (56 < n && n <= 63)
            answer = 9;
        else if (63 < n && n <= 70)
            answer = 10;
        else if (70 < n && n <= 77)
            answer = 11;
        else if (77 < n && n <= 84)
            answer = 12;
        else if (84 < n && n <= 91)
            answer = 13;
        else if (91 < n && n <= 98)
            answer = 14;
        else if (98 < n && n <= 105)
            answer = 15;
        return answer;
    }
}