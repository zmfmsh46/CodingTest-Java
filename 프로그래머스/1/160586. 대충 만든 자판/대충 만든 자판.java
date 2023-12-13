import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> keyCount = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char temp = key.charAt(i);
                if (keyCount.getOrDefault(temp, 100) > i) {
                    keyCount.put(temp, i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (Character c : targets[i].toCharArray()) {
                if(keyCount.containsKey(c)){
                    count += keyCount.get(c);
                } else {
                    count = -1;
                    break;
                }

            }
            answer[i] = count;
        }
        return answer;
    }
}