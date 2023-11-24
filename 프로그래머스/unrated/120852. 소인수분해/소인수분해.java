import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                result.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            result.add(n);
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}