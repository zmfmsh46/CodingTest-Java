import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_prefix) {
        ArrayList<String> answer = new ArrayList<>();
        int result;
        for (int i = 2; i < my_string.length() + 1; i++) {
            answer.add(my_string.substring(0,i));
        }
        result = answer.contains(is_prefix) == true ? 1 : 0;
        
        return result;
    }
}