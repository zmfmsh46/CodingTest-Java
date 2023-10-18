import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>(List.of(my_string.split(" ")));
        answer.removeAll(Arrays.asList(""));
        return answer.toArray(String[]::new);
    }
}