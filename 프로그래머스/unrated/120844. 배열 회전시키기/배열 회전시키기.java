import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();

        for (int number : numbers) {
            deque.add(number);
        }
        
        
        if (direction.equals("left")) {
            deque.addLast(deque.removeFirst());
        } else if (direction.equals("right")) {
            deque.addFirst(deque.removeLast());
        }
        answer = deque.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}