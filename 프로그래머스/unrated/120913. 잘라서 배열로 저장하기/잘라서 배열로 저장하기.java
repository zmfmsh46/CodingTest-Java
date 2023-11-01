import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int start_index = 0;
        int end_index = n;
        ArrayList<String> answer = new ArrayList<>();

        while (end_index <= my_str.length()) {
            answer.add(my_str.substring(start_index, end_index));
            start_index = end_index;
            end_index += n;
            if (end_index > my_str.length()) {
                answer.add(my_str.substring(start_index));
                answer.removeAll(Arrays.asList("", null));
                break;
            }
        }
        
        return answer.toArray(String[]::new);
    }
}