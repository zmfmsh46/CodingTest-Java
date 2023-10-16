import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> answer = new ArrayList<>();
        int start_index = 0, end_index = 0;

        while (my_string.indexOf(" ") != -1) {
            end_index = my_string.indexOf(" ");
            answer.add(my_string.substring(start_index, end_index));
            my_string = my_string.substring(++end_index);
        }
        answer.add(my_string);
        
        return answer.toArray(String[]::new);
    }
}