import java.util.ArrayList;
import java.util.stream.IntStream;


class Solution {
    public int[] solution(int n) {
        /*ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();*/
        
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}