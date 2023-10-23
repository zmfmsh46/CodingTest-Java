import java.util.*;

class Solution {
    public int solution(String[] strArr) {

        Map<Integer, Integer> answer = new HashMap<>();

        for (String str : strArr) {
            int key = str.length();
            if (answer.containsKey(key)) {
                answer.put(key, answer.get(key) + 1);
            } else {
                answer.put(key, 1);
            }
        }
        
        return Collections.max(answer.values());
    }
}