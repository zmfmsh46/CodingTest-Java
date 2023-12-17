import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        char[] ch_s = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < ch_s.length; i++) {
            int idx = stringBuilder.lastIndexOf(String.valueOf(ch_s[i]));
            idx = idx == -1 ? idx : i - idx;
            answer[i] = idx;
            stringBuilder.append(ch_s[i]);
        }
        return answer;
    }
}