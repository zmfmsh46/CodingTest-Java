import java.util.*;

class Solution {
    public int solution(String before, String after) {
        Deque<String> deque = new ArrayDeque<>(Arrays.asList(after.split("")));
        for (String str : before.split("")) {
            deque.remove(str);
        }

        int answer = deque.isEmpty() ? 1 : 0;
        return answer;
    }
}