import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> buffer = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                buffer.add(numbers[i] + numbers[j]);
            }
        }

        answer = buffer.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}