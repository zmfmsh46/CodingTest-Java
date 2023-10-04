import java.util.ArrayList;

class Solution {
    
    public int solution(String my_string, String is_suffix) {
        
        ArrayList<String> answer = new ArrayList<>();
        int result;

        for (int i = my_string.length() - 1; i > -1; i--) {
            answer.add(my_string.substring(i));
        }
        result = answer.contains(is_suffix) == true ? 1 : 0;
        
        return result;
    }
}