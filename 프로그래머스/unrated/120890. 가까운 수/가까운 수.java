import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        if (n <= array[0]) {
            answer = array[0];
        } else if (n >= array[array.length - 1]) {
            answer = array[array.length - 1];
        } else {
            int bs = Arrays.binarySearch(array, n);
            int index = bs >= 0 ? bs + 1 : (bs + 1) * -1;
            answer = (n - array[index-1]) <= (array[index] - n) ? array[index-1] : array[index];
        }
        return answer;
    }
}