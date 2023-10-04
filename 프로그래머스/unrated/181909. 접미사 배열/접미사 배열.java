import java.util.ArrayList;
import java.util.Objects;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String[] result = {};
        
        for (int i = my_string.length() -1; i > -1; i--) {
            answer.add(my_string.substring(i));
        }
        result = answer.stream().map(Objects::toString).sorted().toArray(String[]::new);
        
        return result;
    }
}