import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int n = (int) (Math.log(arr.length) / Math.log(2));
        int exponent = arr.length % Math.pow(2, n) == 0 ? n : n + 1;
        
        return Arrays.copyOf(arr, (int) Math.pow(2,exponent));
    }
}