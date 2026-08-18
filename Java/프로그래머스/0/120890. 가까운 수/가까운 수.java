import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = n - array[i];
        }
        int minIndex = 0;
        int minDiff = Math.abs(a[0]);
        for (int i = 1; i < a.length; i++) {
            int currentDiff = Math.abs(a[i]);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                minIndex = i;
            }
        }
        return array[minIndex];
    }
}