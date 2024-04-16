import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
    }
}