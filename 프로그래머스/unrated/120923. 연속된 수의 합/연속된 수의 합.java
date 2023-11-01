import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int n = total / num;
        int i =0, j =0;
        ArrayList<Integer> answer = new ArrayList<>();
        
        if (num % 2 == 1) {
            answer.add(n);
            while (answer.size() < num) {
                answer.add(n + (--i));
                answer.add(n + (++j));
            }
        } else {
            while (answer.size() < num) {
                answer.add(n + (i--));
                answer.add(n + (++j));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}