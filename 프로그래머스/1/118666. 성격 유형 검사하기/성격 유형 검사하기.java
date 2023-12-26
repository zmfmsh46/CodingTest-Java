import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] personality = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < survey.length; i++) {
            char[] ch = survey[i].toCharArray();
            int score = choices[i] - 4;
            if (score < 0) {
                map.put(ch[0], map.getOrDefault(ch[0], 0) + Math.abs(score));
            } else if (score > 0) {
                map.put(ch[1], map.getOrDefault(ch[1], 0) + score);
            }
        }

        for (int i = 0; i < personality.length; i += 2) {
            int score01 = map.getOrDefault(personality[i], 0);
            int score02 = map.getOrDefault(personality[i+1], 0);
            if (score01 < score02) {
                answer.append(personality[i + 1]);
            } else {
                answer.append(personality[i]);
            }
        }
        return answer.toString();
    }
}