import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();

        for (String str : strlist) {
            result.add(str.length());
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}