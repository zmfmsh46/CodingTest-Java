import java.util.*;

class Solution {
    public String solution(String my_string) {
        Map<Character, Integer> answer = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : my_string.toCharArray()) {
            if (!answer.containsKey(c)) {
                answer.put(c,1);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}