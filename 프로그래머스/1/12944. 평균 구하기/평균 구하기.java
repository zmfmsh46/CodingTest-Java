import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        BigDecimal sum = new BigDecimal(Arrays.stream(arr).sum());
        BigDecimal arr_count = new BigDecimal(arr.length);
        try {
            answer = sum.divide(arr_count).doubleValue();
        } catch (Exception e) {
            answer = sum.divide(arr_count, 10, BigDecimal.ROUND_DOWN).doubleValue();
        }
        return answer;
    }
}