import java.io.IOException;
import java.util.*;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> alphabatToInteger = new ArrayList<>();
        for (char c : s.toCharArray()) {
            alphabatToInteger.add((int) c);
        }

        StringBuilder answer = new StringBuilder();
        alphabatToInteger.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).forEach(i -> answer.append((char) i));
        return answer.toString();
    }
}