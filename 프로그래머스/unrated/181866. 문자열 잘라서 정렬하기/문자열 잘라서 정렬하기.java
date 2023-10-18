import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> answer = new ArrayList<>(List.of(myString.split("x")));
        answer.removeAll(List.of(""));
        Collections.sort(answer);
        return answer.toArray(String[]::new);
    }
}