class Solution {
    public int[] solution(int[] num_list) {
        int odd_num = 0;
        int even_num = 0;
        for(int i=0; i<num_list.length; i++) {
            if (num_list[i]%2 == 0) {
                even_num += 1;
            }
            else
                odd_num += 1;
        }
        int[] answer = {even_num, odd_num};
        return answer;
    }
}