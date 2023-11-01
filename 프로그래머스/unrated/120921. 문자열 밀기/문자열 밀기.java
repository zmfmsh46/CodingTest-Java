import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String buffer;

        Deque<String> deque = new LinkedList<>();
        for (Character c : A.toCharArray()) {
            deque.add(c.toString());
        }
        while (A.equals(B) != true) {
            buffer = deque.pollLast();
            deque.addFirst(buffer);
            A = String.join("",deque);
            answer++;
            if (answer > A.length()) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}