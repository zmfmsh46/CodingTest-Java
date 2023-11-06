import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> list = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();

        for (Character c : s.toCharArray()) {
            if (list.containsKey(c)) {
                list.put(c, list.get(c) + 1);
            } else {
                list.put(c, 1);
            }
        }

        for(Character key:list.keySet()) {
            if (list.get(key) == 1) {
                answer.add(key.toString());
            }
        }

        return answer.stream().sorted().collect(Collectors.joining());
    }
}