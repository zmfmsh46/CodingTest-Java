import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).average().getAsDouble();
        return answer;
    }
}