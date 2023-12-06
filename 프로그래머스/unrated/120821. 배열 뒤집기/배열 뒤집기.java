import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : num_list) {
            answer.add(num);
        }
        Collections.reverse(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}