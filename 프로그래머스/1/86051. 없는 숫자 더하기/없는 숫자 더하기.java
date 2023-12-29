import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        ArrayList<Integer> check = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for (int number : numbers) {
            if (check.contains(number)) {
                check.remove(Integer.valueOf(number));
            }
        }

        if (!check.isEmpty()) {
            answer = 0;
            for (int i = 0; i < check.size(); i++) {
                answer += check.get(i);
            }
        }
        return answer;
    }
}