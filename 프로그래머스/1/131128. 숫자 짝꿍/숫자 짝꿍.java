import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : Y.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : X.toCharArray()) {
        if (map.get(c) != null && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                answer.add(Character.getNumericValue(c));
            }
        }

        if (answer.isEmpty()) {
            stringBuilder.append(-1);
        } else {
            ArrayList<Integer> buffer = (ArrayList<Integer>) answer.clone();
            buffer.removeAll(List.of(0));
            if (buffer.isEmpty()) {
                stringBuilder.append(0);
            } else {
                Collections.sort(answer, Collections.reverseOrder());
                for (int i = 0; i < answer.size(); i++) {
                    stringBuilder.append(answer.get(i));
                }
            }
        }
        
        return stringBuilder.toString();
    }
}